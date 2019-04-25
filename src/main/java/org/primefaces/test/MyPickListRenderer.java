package org.primefaces.test;

import org.primefaces.component.picklist.PickList;
import org.primefaces.component.picklist.PickListRenderer;
import org.primefaces.model.DualListModel;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;

public class MyPickListRenderer
    extends PickListRenderer
{
    @Override
    public Object getConvertedValue(FacesContext context, UIComponent component, Object submittedValue)
        throws ConverterException
    {
        try {
            PickList pickList = (PickList) component;
            String[][] value = (String[][]) submittedValue;
            String[] sourceValue = value[0];
            String[] targetValue = value[1];
            DualListModel<?> model = new CollectionDualListModel();

            pickList.populateModel(context, sourceValue, model.getSource());
            pickList.populateModel(context, targetValue, model.getTarget());

            return model;
        }
        catch (Exception exception) {
            throw new ConverterException(exception);
        }
    }
}
