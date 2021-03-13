package com.lok.user.service;

import com.lok.user.entities.UserEntity;
import com.lok.user.repo.UserRepository;
import com.lok.user.vo.Department;
import com.lok.user.vo.UserDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public UserEntity saveUser(UserEntity userEntity) {
         return userRepository.save(userEntity);
    }

    public UserDepartment getUser(int id) {
        Optional<UserEntity> optionalUserEntity = userRepository.findById(id);
        if(!optionalUserEntity.isPresent()) {
            return null;
        }
        UserEntity userEntity = optionalUserEntity.get();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/dept/getDept/" +
                userEntity.getDepId(), Department.class);

        return UserDepartment.builder().userEntity(userEntity).department(department).build();
    }
}
