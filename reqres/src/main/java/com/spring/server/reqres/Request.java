package com.spring.server.reqres;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Request {

    @RequestMapping("/hello")
    public String sendHello() {
        return "Hello World from new project";
    }
}
