package com.lok.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FalloutController {

    @GetMapping("/userServiceFallout")
    public String userServiceFalloutMethod(){
        return "User Service is not available please try later";
    }

    @GetMapping("/deptServiceFallout")
    public String deptServiceFalloutMethod(){
        return "Department Service is not available please try later";
    }

}
