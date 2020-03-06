
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class LanguagesCodes implements Serializable
{

    private Integer en;
    private final static long serialVersionUID = -3080815038761801768L;

    public Integer getEn() {
        return en;
    }

    public void setEn(Integer en) {
        this.en = en;
    }

}
