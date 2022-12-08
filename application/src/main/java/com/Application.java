package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring";
    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
//        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }

}
