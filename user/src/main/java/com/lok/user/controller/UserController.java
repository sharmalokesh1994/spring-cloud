package com.lok.user.controller;

import com.lok.user.entities.UserEntity;
import com.lok.user.service.UserService;
import com.lok.user.vo.UserDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
        return new ResponseEntity<>( userService.saveUser(userEntity), HttpStatus.CREATED );
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<UserDepartment> getUser(@PathVariable("id") Integer userId) {
        return new ResponseEntity<>(userService.getUser(userId), HttpStatus.ACCEPTED);
    }

}
