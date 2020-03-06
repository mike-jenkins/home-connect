package com.mikejenkins.homeconnect.service.foodfacts;

import com.mikejenkins.homeconnect.foodfacts.Product;
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
class OpenFoodFactsServiceTest {
    @Autowired
    OpenFoodFactsService foodFactsService;

    @Test
    void lookupProduct() {
        Product product = foodFactsService.lookupProduct("027000390054");
        System.out.println("Product");
    }
}