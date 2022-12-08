package com;

import com.devanix.Holoman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }

    @Bean
    public Holoman holoman() {
        Holoman holoman = new Holoman();
        holoman.setHowLong(10);
        holoman.setName("luka");
        return holoman;
    }
}