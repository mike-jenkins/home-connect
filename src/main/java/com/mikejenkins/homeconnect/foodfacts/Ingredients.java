
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class Ingredients implements Serializable
{

    private Thumb_ thumb;
    private Display_ display;
    private Small_ small;
    private final static long serialVersionUID = 8697400112861283884L;

    public Thumb_ getThumb() {
        return thumb;
    }

    public void setThumb(Thumb_ thumb) {
        this.thumb = thumb;
    }

    public Display_ getDisplay() {
        return display;
    }

    public void setDisplay(Display_ display) {
        this.display = display;
    }

    public Small_ getSmall() {
        return small;
    }

    public void setSmall(Small_ small) {
        this.small = small;
    }

}
