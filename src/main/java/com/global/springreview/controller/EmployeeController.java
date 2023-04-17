package com.global.springreview.controller;

import com.global.springreview.base.BaseController;
import com.global.springreview.entity.Employee;
import com.global.springreview.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController extends BaseController<Employee,Long> {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping(path = "/statistics")
    public ResponseEntity<?> getHRStatistics(){
        return ResponseEntity.ok(employeeService.getHRStatistics());
    }
}
