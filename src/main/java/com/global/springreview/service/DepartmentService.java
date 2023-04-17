package com.global.springreview.service;

import com.global.springreview.base.BaseService;
import com.global.springreview.entity.Department;
import com.global.springreview.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService extends BaseService<Department,Long> {
    @Autowired
    private DepartmentRepo departmentRepo;

    public Optional<Department> findByName(String name){
        return departmentRepo.findByName(name);
    }

}
