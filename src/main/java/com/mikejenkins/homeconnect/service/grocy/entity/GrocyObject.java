package com.mikejenkins.homeconnect.service.grocy.entity;

/**
 * @author Mike Jenkins
 * @version 1.0, 3/5/2020
 * @since 1.0
 */
public abstract class GrocyObject {
    protected int id;
    protected String name;
    protected String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
