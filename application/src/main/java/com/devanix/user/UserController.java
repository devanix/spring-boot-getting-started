package com.devanix.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user) {
        return user;
    }
}
