
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class Sizes implements Serializable
{

    private com.mikejenkins.homeconnect.foodfacts._100 _100;
    private com.mikejenkins.homeconnect.foodfacts._400 _400;
    private Full full;
    private final static long serialVersionUID = 8680766379492082462L;

    public com.mikejenkins.homeconnect.foodfacts._100 get100() {
        return _100;
    }

    public void set100(com.mikejenkins.homeconnect.foodfacts._100 _100) {
        this._100 = _100;
    }

    public com.mikejenkins.homeconnect.foodfacts._400 get400() {
        return _400;
    }

    public void set400(com.mikejenkins.homeconnect.foodfacts._400 _400) {
        this._400 = _400;
    }

    public Full getFull() {
        return full;
    }

    public void setFull(Full full) {
        this.full = full;
    }

}
