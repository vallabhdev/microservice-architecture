package com.prateeksoni.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/userServiceFallBack")
    public String fallBackUser() {
        return "User service is taking longer than usual. Please try later...";
    }

    @GetMapping("/departmentServiceFallBack")
    public String fallBackDept() {
        return "Department service is taking longer than usual. Please try later...";
    }
}
