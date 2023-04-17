package com.global.springreview.service;

import com.global.springreview.base.BaseService;
import com.global.springreview.entity.Role;
import com.global.springreview.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends BaseService<Role,Long> {
    @Autowired
    private RoleRepo roleRepo;
}
