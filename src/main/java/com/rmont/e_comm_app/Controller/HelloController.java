package com.rmont.e_comm_app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String HelloWorld() {
        return "Hello World";
    }
}
