
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class IngredientsEn implements Serializable
{

    private String rev;
    private String geometry;
    private Object normalize;
    private Sizes___________ sizes;
    private Object whiteMagic;
    private String imgid;
    private final static long serialVersionUID = -3742035114592010427L;

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getGeometry() {
        return geometry;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }

    public Object getNormalize() {
        return normalize;
    }

    public void setNormalize(Object normalize) {
        this.normalize = normalize;
    }

    public Sizes___________ getSizes() {
        return sizes;
    }

    public void setSizes(Sizes___________ sizes) {
        this.sizes = sizes;
    }

    public Object getWhiteMagic() {
        return whiteMagic;
    }

    public void setWhiteMagic(Object whiteMagic) {
        this.whiteMagic = whiteMagic;
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid;
    }

}
