package com.mvnjed.jedd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JeddApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeddApplication.class, args);
    }

    @GetMapping("./")
    public String hello() {
        return "Hello World from Jed";
    }

}
