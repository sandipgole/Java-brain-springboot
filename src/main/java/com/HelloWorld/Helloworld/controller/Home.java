package com.HelloWorld.Helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/")
    public String sayHi()
        {
        return "HI stay home stay safe.....";

    }
    @RequestMapping("/hello")
    public String sayHello()
    {
        return "Hello.....";
    }
}
