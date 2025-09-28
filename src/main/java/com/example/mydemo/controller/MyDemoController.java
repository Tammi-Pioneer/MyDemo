package com.example.mydemo.controller;

import com.example.mydemo.service.MyDemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDemoController {
    private final MyDemoService myService;
    public MyDemoController(MyDemoService myService){
        this.myService = myService;
    }

    @GetMapping("/hello")
    public String hello(){
        return myService.getGreeting();
    }
}
