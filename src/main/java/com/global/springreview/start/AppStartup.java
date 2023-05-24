package com.global.springreview.start;

import com.global.springreview.entity.Role;
import com.global.springreview.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartup implements CommandLineRunner {
    @Autowired
    private RoleService roleService;

    @Override
    public void run(String... args) throws Exception {
        if (roleService.findAll().isEmpty()) {
            Role admin = new Role();
            admin.setName("ROLE_ADMIN");
            Role user = new Role();
            user.setName("ROLE_USER");

            roleService.insert(admin);
            roleService.insert(user);
        }

    }
}
