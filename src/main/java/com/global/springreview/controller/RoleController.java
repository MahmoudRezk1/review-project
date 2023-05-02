package com.global.springreview.controller;

import com.global.springreview.base.BaseController;
import com.global.springreview.entity.Role;
import com.global.springreview.service.RoleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "Role Controller")
@RestController
@RequestMapping(path = "/role")
public class RoleController extends BaseController<Role,Long> {
    @Autowired
    private RoleService roleService;
}
