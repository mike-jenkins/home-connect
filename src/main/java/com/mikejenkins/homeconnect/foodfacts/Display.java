
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class Display implements Serializable
{

    private String en;
    private final static long serialVersionUID = -8909714427044034335L;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

}
