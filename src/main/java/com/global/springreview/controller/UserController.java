package com.global.springreview.controller;

import com.global.springreview.base.BaseController;
import com.global.springreview.entity.User;
import com.global.springreview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController extends BaseController<User,Long> {
    @Autowired
    private UserService userService;
}
