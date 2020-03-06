package com.mikejenkins.homeconnect.service.grocy;

import com.mikejenkins.homeconnect.service.GrocyServiceInterface;
import com.mikejenkins.homeconnect.service.grocy.entity.Location;
import com.mikejenkins.homeconnect.service.grocy.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpRequestInitializer;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * @author Mike Jenkins
 * @version 1.0, 3/5/2020
 * @since 1.0
 */

@Service
public class GrocyService implements GrocyServiceInterface {
    private RestTemplate restTemplate = new RestTemplate();

    private static final String API_BASE_URL = "https://grocy.mike-jenkins.com/api";

    private HttpHeaders httpHeaders = new HttpHeaders();

    public GrocyService() {
        httpHeaders.add("GROCY-API-KEY", "m8Z25a9m07I7M5mMytS7mXLgoZ1vsImsci2cTOip5yWjyb5abs");
    }

    @Override
    public List<Product> getProducts() {

        HttpEntity entity = new HttpEntity<>("", httpHeaders);
        ResponseEntity<List<Product>> responseEntity = restTemplate.exchange(API_BASE_URL + ServiceUrls.PRODUCTS, HttpMethod.GET, entity, new ParameterizedTypeReference<List<Product>>() {});

        List<Product> products = responseEntity.getBody();

        return products;
    }

    @Override
    public List<Location> getLocations() {
        HttpEntity entity = new HttpEntity<>("", httpHeaders);
        ResponseEntity<List<Location>> responseEntity = restTemplate.exchange(API_BASE_URL + ServiceUrls.LOCATIONS, HttpMethod.GET, entity, new ParameterizedTypeReference<List<Location>>() {});

        List<Location> locations = responseEntity.getBody();

        return locations;
    }

    private enum ServiceUrls{
        PRODUCTS("/objects/products"),
        LOCATIONS("/objects/locations");

        String url;

        ServiceUrls(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return url;
        }
    }
}
