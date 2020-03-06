
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class Front implements Serializable
{

    private Display display;
    private Small small;
    private Thumb thumb;
    private final static long serialVersionUID = 603512156742396573L;

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Small getSmall() {
        return small;
    }

    public void setSmall(Small small) {
        this.small = small;
    }

    public Thumb getThumb() {
        return thumb;
    }

    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

}
