package org.primefaces.test;

import java.io.Serializable;

public class Person implements Serializable
{
    private static long idCounter = 0;

    private Long id;
    private String firstName;
    private String lastName;
    private String email;


    Person(String firstName, String lastName, String email)
    {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId()
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
