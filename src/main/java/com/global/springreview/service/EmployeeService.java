package com.global.springreview.service;

import com.global.springreview.base.BaseService;
import com.global.springreview.entity.Department;
import com.global.springreview.entity.Employee;
import com.global.springreview.exceptions.DuplicateRecordException;
import com.global.springreview.projection.HRStatisticsProjection;
import com.global.springreview.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService extends BaseService<Employee,Long> {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private MessageSource messageSource;

    @Override
    public Employee insert(Employee employee) {

        if(employee.getDepartment()!=null && employee.getDepartment().getName() != null){

            Optional<Employee> emp =employeeRepo.findByEmail(employee.getEmail());
            if (emp.isPresent()){
                String message =messageSource.getMessage("validation.constraints.Email.duplicated.message"
                        ,null, LocaleContextHolder.getLocale());
                throw new DuplicateRecordException(message);
            }

            Optional<Department> department = departmentService.findByName(employee.getDepartment().getName());
            department.ifPresent(employee::setDepartment);
        }
        return super.insert(employee);
    }
    public HRStatisticsProjection getHRStatistics(){
        return employeeRepo.getHRStatistics();
    }
}
