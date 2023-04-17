package com.global.springreview.repository;

import com.global.springreview.base.BaseRepo;
import com.global.springreview.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends BaseRepo<User,Long> {
}
