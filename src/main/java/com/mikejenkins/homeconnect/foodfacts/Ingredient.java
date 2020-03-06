
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class Ingredient implements Serializable
{

    private String text;
    private String vegan;
    private Integer rank;
    private String vegetarian;
    private String id;
    private final static long serialVersionUID = -6861396798691584988L;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getVegan() {
        return vegan;
    }

    public void setVegan(String vegan) {
        this.vegan = vegan;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
