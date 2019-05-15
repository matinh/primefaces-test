package org.primefaces.test;

import java.io.Serializable;

public class ColumnModel implements Serializable
{
    private String header;
    private String property;
    private String sort;
    private String filter;


    ColumnModel(String header, String property, String sort, String filter)
    {
        this.header = header;
        this.property = property;
        this.sort = sort;
        this.filter = filter;
    }

    public String getHeader()
    {
        return header;
    }

    public String getProperty()
    {
        return property;
    }

    public String getSort()
    {
        return sort;
    }

    public String getFilter()
    {
        return filter;
    }
}
