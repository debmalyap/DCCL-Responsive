package com.qbent.enfinsapp.model;

//----Developed by Debmalya----//
public class GramPanchayet
{
    private String name;
    private String id;

    public GramPanchayet(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
}
