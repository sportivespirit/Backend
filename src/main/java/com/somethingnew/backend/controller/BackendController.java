package com.somethingnew.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class BackendController {

    @GetMapping("ping")
    public String health(){
        return "Hello, I am Alive";
    }
}
