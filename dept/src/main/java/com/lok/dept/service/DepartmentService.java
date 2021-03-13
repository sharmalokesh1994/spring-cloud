package com.lok.dept.service;

import com.lok.dept.entity.DepartmentEntity;

public interface DepartmentService {

    DepartmentEntity createDept(DepartmentEntity departmentEntity);
    DepartmentEntity findDept(int id);

}
