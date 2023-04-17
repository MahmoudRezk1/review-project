package com.global.springreview.repository;

import com.global.springreview.base.BaseRepo;
import com.global.springreview.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepo extends BaseRepo<Department, Long> {
    Optional<Department> findByName(String name);
}
