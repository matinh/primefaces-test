package org.primefaces.test;

import org.primefaces.model.DualListModel;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Named
@RequestScoped
public class TestViewCdi {

    private String someInput = null;
    private Integer activeTab = 0;


    public String getSomeInput()
    {
        return someInput;
    }

    public void setSomeInput(String someInput)
    {
        this.someInput = someInput;
    }

    public Integer getActiveTab()
    {
        return activeTab;
    }

    public void setActiveTab(Integer activeTab)
    {
        this.activeTab = activeTab;
    }
}
