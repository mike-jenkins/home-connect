package com.mikejenkins.homeconnect.service.grocy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mike Jenkins
 * @version , 3/5/2020
 * @since
 */
@SpringBootTest
class GrocyServiceTest {

    @Autowired
    GrocyService grocyService;

    @Test
    void getProducts() {
        grocyService.getProducts();
    }

    @Test
    void getLocations() {
        grocyService.getLocations();
    }
}