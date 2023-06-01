package com.examples.demos.Service;

import com.examples.demos.Entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {
    private RestTemplate restTemplate;

    public ServiceLayer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User consumeAPI(){
        return restTemplate.getForObject("https://jservice.io/api/random", User.class);
    }
}
