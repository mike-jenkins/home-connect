package com.mikejenkins.homeconnect.service;

import com.mikejenkins.homeconnect.service.grocy.entity.Location;
import com.mikejenkins.homeconnect.service.grocy.entity.Product;

import java.util.List;

/**
 * @author Mike Jenkins
 * @version 1.0, 3/5/2020
 * @since 1.0
 */
public interface GrocyServiceInterface {
    List<Product> getProducts();
    List<Location> getLocations();
}
