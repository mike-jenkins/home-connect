
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class _2 implements Serializable
{

    private Sizes_ sizes;
    private Integer uploadedT;
    private String uploader;
    private final static long serialVersionUID = 6883928376458934522L;

    public Sizes_ getSizes() {
        return sizes;
    }

    public void setSizes(Sizes_ sizes) {
        this.sizes = sizes;
    }

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

}
