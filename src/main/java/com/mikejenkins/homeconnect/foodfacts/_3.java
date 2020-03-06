
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class _3 implements Serializable
{

    private Sizes__ sizes;
    private String uploader;
    private Integer uploadedT;
    private final static long serialVersionUID = 1954091944462933095L;

    public Sizes__ getSizes() {
        return sizes;
    }

    public void setSizes(Sizes__ sizes) {
        this.sizes = sizes;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public Integer getUploadedT() {
        return uploadedT;
    }

    public void setUploadedT(Integer uploadedT) {
        this.uploadedT = uploadedT;
    }

}
