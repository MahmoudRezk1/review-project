package com.global.springreview.controller;

import com.global.springreview.base.BaseController;
import com.global.springreview.entity.Employee;
import com.global.springreview.service.EmployeeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "Employee Controller")
@RestController
@RequestMapping(path = "/employee")
public class EmployeeController extends BaseController<Employee,Long> {
    @Autowired
    private EmployeeService employeeService;
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200",description = "found",content = {@Content(mediaType = "application/json"
//                    , schema=@Schema(implementation = Employee.class))}),
//            @ApiResponse(responseCode = "404",description = "not found")
//    })
    @GetMapping(path = "/statistics")
    public ResponseEntity<?> getHRStatistics(){
        return ResponseEntity.ok(employeeService.getHRStatistics());
    }
}
