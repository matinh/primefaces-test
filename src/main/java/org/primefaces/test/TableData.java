package org.primefaces.test;

import java.io.Serializable;

public class TableData implements Serializable
{
    private Long id;
    private String string;

    public TableData(Long id, String string)
    {
        this.id = id;
        this.string = string;
    }

    public Long getId()
    {
        return id;
    }

    public String getString()
    {
        return string;
    }
}
