package com.examples.demos.Controller;

import com.examples.demos.Entity.User;
import com.examples.demos.Service.ServiceLayer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private ServiceLayer serviceLayer;

    public HomeController(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    @GetMapping("/")
    public ResponseEntity<User> getData() {
        return new ResponseEntity<>(serviceLayer.consumeAPI(), HttpStatus.OK);
    }
}

