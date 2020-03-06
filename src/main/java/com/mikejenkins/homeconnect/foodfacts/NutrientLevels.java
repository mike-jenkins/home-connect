
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class NutrientLevels implements Serializable
{

    private String saturatedFat;
    private String sugars;
    private String salt;
    private String fat;
    private final static long serialVersionUID = 3667497171929028560L;

    public String getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(String saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public String getSugars() {
        return sugars;
    }

    public void setSugars(String sugars) {
        this.sugars = sugars;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

}
