package com.ling1.myapplication.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RestController
public class HelloController {
    @RequestMapping("say")
    public String say(String name) {
        return "Hello, " + name;
    }
}
