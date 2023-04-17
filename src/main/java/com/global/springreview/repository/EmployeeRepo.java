package com.global.springreview.repository;

import com.global.springreview.base.BaseRepo;
import com.global.springreview.entity.Employee;
import com.global.springreview.projection.HRStatisticsProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends BaseRepo<Employee,Long> {
    @Query(value = "select (select count(*) from employees) empCount ," +
            "(select count(*) from departments) deptCount," +
            "(select count(*) from users) userCount",nativeQuery = true)
    HRStatisticsProjection getHRStatistics();
}