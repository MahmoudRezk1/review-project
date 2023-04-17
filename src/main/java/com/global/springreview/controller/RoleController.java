package com.global.springreview.controller;

import com.global.springreview.base.BaseController;
import com.global.springreview.entity.Role;
import com.global.springreview.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/role")
public class RoleController extends BaseController<Role,Long> {
    @Autowired
    private RoleService roleService;
}
