package com.ggboy.sdc.web.controller;

import com.ggboy.sdc.web.domain.entry.UserCenter;
import com.ggboy.sdc.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("index")
    public Object index() {
        UserCenter user = new UserCenter();
        user.setId(4);
        user.setAge("123");
        UserCenter userCenter = userRepository.save(user);
        return "Hello World!";
    }
}