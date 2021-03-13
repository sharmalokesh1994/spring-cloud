package com.lok.dept.service.impl;

import com.lok.dept.entity.DepartmentEntity;
import com.lok.dept.repo.DepartmentRepository;
import com.lok.dept.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentEntity createDept(DepartmentEntity departmentEntity) {
        log.info("inside createDept ");
        return departmentRepository.save(departmentEntity);
    }

    @Override
    public DepartmentEntity findDept(int id) {
        log.info("inside createDept ");
        Optional<DepartmentEntity> optionalDepartmentEntity = departmentRepository.findById(id);
        if(!Objects.isNull(optionalDepartmentEntity) && optionalDepartmentEntity.isPresent() ){
            return optionalDepartmentEntity.get();
        }
        return null;
    }
}
