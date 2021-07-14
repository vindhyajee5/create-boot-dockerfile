package com.ynz.demo.createbootdockerfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("api")
public class CreateBootDockerfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreateBootDockerfileApplication.class, args);
    }

    @GetMapping("welcome")
    public String welcome() {
        return "running a container from a Dockerfile";
    }

}
