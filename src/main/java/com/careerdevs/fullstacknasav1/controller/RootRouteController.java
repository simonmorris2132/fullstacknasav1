package com.careerdevs.fullstacknasav1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootRouteController {
    
    @RequestMapping
    public String index() {
        return "index";
    }

}
