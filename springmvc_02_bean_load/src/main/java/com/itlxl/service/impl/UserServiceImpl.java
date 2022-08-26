package com.itlxl.service.impl;

import com.itlxl.domain.User;
import com.itlxl.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("user service ...");
    }
}
