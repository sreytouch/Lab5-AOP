package com.example.aop.controller;

import com.example.aop.aspect.annotation.ExecutionTime;
import com.example.aop.aspect.annotation.LogMe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @ExecutionTime
    @GetMapping("")
    public void getAll(@RequestHeader Map<String, String> headers){
        Map<String, String> var = headers;
        System.out.println("getAll method is called");
    }

}
