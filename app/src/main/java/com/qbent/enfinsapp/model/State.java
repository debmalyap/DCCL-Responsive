package com.qbent.enfinsapp.model;

public class State {
    private String name;
    private String id;

    public State(String id, String name)
    {
        this.name = name;
        this.id = id;
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
}
