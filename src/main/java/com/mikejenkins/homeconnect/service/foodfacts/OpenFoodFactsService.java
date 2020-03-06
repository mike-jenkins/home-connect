package com.mikejenkins.homeconnect.service.foodfacts;

import com.mikejenkins.homeconnect.foodfacts.OpenFoodItem;
import com.mikejenkins.homeconnect.foodfacts.Product;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mike Jenkins
 * @version 1.0, 3/5/2020
 * @since 1.0
 */
@Service
public class OpenFoodFactsService {
    private RestTemplate restTemplate = new RestTemplate();

    private static final String API_BASE_URL = "https://world.openfoodfacts.org/api/v0";

    private HttpHeaders httpHeaders = new HttpHeaders();

    public OpenFoodFactsService() {
        httpHeaders.add("User-Agent", "HomeConnect - Java - Version 0.1 - mike-jenkins.com");
    }

    public Product lookupProduct(String barcode){

        HttpEntity entity = new HttpEntity("", httpHeaders);

        ResponseEntity<OpenFoodItem> responseEntity = restTemplate.exchange(
                String.format("%s/product/%s.json", API_BASE_URL, barcode),
                HttpMethod.GET, entity, new ParameterizedTypeReference<OpenFoodItem>() {});


        return responseEntity.getBody().getProduct();
    }
}
