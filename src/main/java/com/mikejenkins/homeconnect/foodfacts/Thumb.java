
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class Thumb implements Serializable
{

    private String en;
    private final static long serialVersionUID = -7120189452662623028L;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

}
