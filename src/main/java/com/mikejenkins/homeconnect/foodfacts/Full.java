
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class Full implements Serializable
{

    private Integer h;
    private Integer w;
    private final static long serialVersionUID = -1690311256010022697L;

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

}
