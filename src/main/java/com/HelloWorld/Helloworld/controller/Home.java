package com.HelloWorld.Helloworld.controller;
import com.HelloWorld.Helloworld.model.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

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
    @RequestMapping("/topics")
    public List<demo> getAllTopics()
    {
        return Arrays.asList(
                new demo("1","Java","programming language"),
                new demo("2","python","programming language"),
                new demo("3","JS","Scripting language"),
                new demo("4","HTML","markup language")
        );
    }
}
