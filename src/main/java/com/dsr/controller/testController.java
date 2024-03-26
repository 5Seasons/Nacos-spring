package com.dsr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Value("${test}")
    private String test;
    @GetMapping("/test")
    public String test() {
        return "Test successful!"+test;
    }
}