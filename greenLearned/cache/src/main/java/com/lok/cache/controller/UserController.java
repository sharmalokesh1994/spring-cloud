package com.lok.cache.controller;

import com.lok.cache.entity.UserEntity;
import com.lok.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UserEntity createUserEntity(@RequestBody UserEntity userEntity) {
        return userService.addUser(userEntity);
    }

    @GetMapping("/get/{id}")
    public UserEntity getUser( @PathVariable Integer id) {

    }

}
