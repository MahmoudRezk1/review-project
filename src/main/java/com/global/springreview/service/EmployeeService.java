package com.global.springreview.service;

import com.global.springreview.base.BaseService;
import com.global.springreview.entity.Department;
import com.global.springreview.entity.Employee;
import com.global.springreview.projection.HRStatisticsProjection;
import com.global.springreview.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService extends BaseService<Employee,Long> {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private DepartmentService departmentService;

    @Override
    public Employee insert(Employee employee) {
        if(employee.getDepartment()!=null && employee.getDepartment().getName() != null){
            Optional<Department> department = departmentService.findByName(employee.getDepartment().getName());
            department.ifPresent(employee::setDepartment);
        }
        return super.insert(employee);
    }
    public HRStatisticsProjection getHRStatistics(){
        return employeeRepo.getHRStatistics();
    }
}