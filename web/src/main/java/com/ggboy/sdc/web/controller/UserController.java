package com.ggboy.sdc.web.controller;

import com.ggboy.sdc.web.domain.entry.User;
import com.ggboy.sdc.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("index")
    public Object index() {
        User user = new User();
        user.setName("Abc");
        userRepository.save(user);
        return "Hello World!";
    }
}