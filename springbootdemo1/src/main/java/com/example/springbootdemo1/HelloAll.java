package com.example.springbootdemo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAll {
    @RequestMapping("/")
    public  String Welcome(){
        return "Welcome i am SpringBoot";
    }

}
