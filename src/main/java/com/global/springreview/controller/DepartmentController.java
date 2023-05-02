package com.global.springreview.controller;

import com.global.springreview.base.BaseController;
import com.global.springreview.entity.Department;
import com.global.springreview.service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@Tag(name = "Department Controller")
@RestController
@RequestMapping(path = "/department")
public class DepartmentController extends BaseController<Department,Long> {
    @Autowired
    private DepartmentService departmentService;
    @Operation(summary = "get department by name")
    @GetMapping(path = "/name/{name}")
    public Optional<Department> findByName(@PathVariable(name = "name") String name){
        return departmentService.findByName(name);
    }


}
