
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class Nutrition implements Serializable
{

    private Small__ small;
    private Display__ display;
    private Thumb__ thumb;
    private final static long serialVersionUID = 1273940814248107494L;

    public Small__ getSmall() {
        return small;
    }

    public void setSmall(Small__ small) {
        this.small = small;
    }

    public Display__ getDisplay() {
        return display;
    }

    public void setDisplay(Display__ display) {
        this.display = display;
    }

    public Thumb__ getThumb() {
        return thumb;
    }

    public void setThumb(Thumb__ thumb) {
        this.thumb = thumb;
    }

}
