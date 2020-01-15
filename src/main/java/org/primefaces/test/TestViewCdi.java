package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestViewCdi implements Serializable {

    private Integer rowsPerPage = 5;
    private List<TableData> tableData;

    @PostConstruct  
    public void init() {
        System.out.println("TestViewCdi.init() called.");
        tableData = new ArrayList<>();
        tableData.add(new TableData(1L, "One"));
        tableData.add(new TableData(2L, "Two"));
        tableData.add(new TableData(3L, "Three"));
        tableData.add(new TableData(4L, "Four"));
        tableData.add(new TableData(5L, "Five"));
    }

    public List<TableData> getTableData()
    {
        return tableData;
    }

    public Integer getRowsPerPage()
    {
        return rowsPerPage;
    }

    public void setRowsPerPage(Integer rowsPerPage)
    {
        this.rowsPerPage = rowsPerPage;
    }
}
