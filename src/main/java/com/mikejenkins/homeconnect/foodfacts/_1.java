
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class _1 implements Serializable
{

    private Integer uploadedT;
    private String uploader;
    private Sizes sizes;
    private final static long serialVersionUID = -5353255260041242762L;

    public Integer getUploadedT() {
        return uploadedT;
    }

    public void setUploadedT(Integer uploadedT) {
        this.uploadedT = uploadedT;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

}
