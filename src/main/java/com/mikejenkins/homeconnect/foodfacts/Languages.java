
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class Languages implements Serializable
{

    private Integer enEnglish;
    private final static long serialVersionUID = -733107435944333495L;

    public Integer getEnEnglish() {
        return enEnglish;
    }

    public void setEnEnglish(Integer enEnglish) {
        this.enEnglish = enEnglish;
    }

}
