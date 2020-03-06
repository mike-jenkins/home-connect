
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class Sizes_ implements Serializable
{

    private _100_ _100;
    private _400_ _400;
    private Full_ full;
    private final static long serialVersionUID = -7066071097737476595L;

    public _100_ get100() {
        return _100;
    }

    public void set100(_100_ _100) {
        this._100 = _100;
    }

    public _400_ get400() {
        return _400;
    }

    public void set400(_400_ _400) {
        this._400 = _400;
    }

    public Full_ getFull() {
        return full;
    }

    public void setFull(Full_ full) {
        this.full = full;
    }

}
