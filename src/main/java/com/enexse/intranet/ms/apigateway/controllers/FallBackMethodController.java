package com.enexse.intranet.ms.apigateway.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/accountingServiceFallBack")
    public String accountingServiceFallBackMethod() {
        return "Accounting Service is taking longer than Expected." +
                " Please try again later";
    }
}
