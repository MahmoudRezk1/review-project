package com.global.springreview.controller;

import com.global.springreview.base.BaseController;
import com.global.springreview.entity.Department;
import com.global.springreview.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/department")
public class DepartmentController extends BaseController<Department,Long> {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping(path = "/name/{name}")
    public Optional<Department> findByName(@PathVariable(name = "name") String name){
        return departmentService.findByName(name);
    }


}
