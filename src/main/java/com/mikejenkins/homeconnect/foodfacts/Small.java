
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class Small implements Serializable
{

    private String en;
    private final static long serialVersionUID = -2153141990818605221L;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

}
