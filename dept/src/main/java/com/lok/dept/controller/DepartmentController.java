package com.lok.dept.controller;

import com.lok.dept.entity.DepartmentEntity;
import com.lok.dept.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/createDept")
    public ResponseEntity<DepartmentEntity> createDept( @RequestBody DepartmentEntity departmentEntity ){
        return new ResponseEntity<DepartmentEntity>(departmentService.createDept(departmentEntity), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getDept/{id}")
    public ResponseEntity<DepartmentEntity> getDept( @PathVariable("id") Integer deptId ){
        return new ResponseEntity<DepartmentEntity>(departmentService.findDept(deptId), HttpStatus.ACCEPTED);
    }

}
