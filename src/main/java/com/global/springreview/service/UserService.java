package com.global.springreview.service;

import com.global.springreview.base.BaseService;
import com.global.springreview.entity.User;
import com.global.springreview.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User,Long> {
    @Autowired
    private UserRepo userRepo;
}
