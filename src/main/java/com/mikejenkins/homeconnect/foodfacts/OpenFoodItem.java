
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class OpenFoodItem implements Serializable
{

    private String statusVerbose;
    private Product product;
    private Integer status;
    private String code;
    private final static long serialVersionUID = 4307245683908344398L;

    public String getStatusVerbose() {
        return statusVerbose;
    }

    public void setStatusVerbose(String statusVerbose) {
        this.statusVerbose = statusVerbose;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
