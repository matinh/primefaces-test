package org.primefaces.test;

import org.primefaces.component.datatable.DataTable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class TestViewCdi
    implements Serializable
{

    private List<Person> tableData;
    private List<ColumnModel> allColumns;
    private List<ColumnModel> columns;


    @PostConstruct
    void init()
    {
        allColumns = new ArrayList<>();
        allColumns.add(new ColumnModel("First Name", "firstName", "firstName", null));
        allColumns.add(new ColumnModel("Last Name", "lastName", "lastName", "lastName"));
        allColumns.add(new ColumnModel("Email", "email", null, "email"));
        columns = new ArrayList<>(allColumns);

        tableData = new ArrayList<>();
        tableData.add(new Person("Martin", "Hoeller", "martin@xss.co.at"));
        tableData.add(new Person("Some", "One", "one@example.com"));
        tableData.add(new Person("Some", "Two", "two@example.com"));
    }

    public List<ColumnModel> getAllColumns()
    {
        return allColumns;
    }

    public List<ColumnModel> getColumns()
    {
        return columns;
    }

    public void setColumns(List<ColumnModel> columns)
    {
        this.columns = columns;
    }

    public List<Person> getTableData()
    {
        return tableData;
    }
}
