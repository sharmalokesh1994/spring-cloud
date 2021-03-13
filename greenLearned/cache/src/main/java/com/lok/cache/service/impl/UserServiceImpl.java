package com.lok.cache.service.impl;

import com.lok.cache.entity.UserEntity;
import com.lok.cache.repo.UserRepository;
import com.lok.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity addUser(UserEntity userEntity) {
        userEntity = userRepository.save(userEntity);
        return userEntity;
    }
}
