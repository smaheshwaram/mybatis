package com.mybatis.testMybatis.controllers;

import com.mybatis.testMybatis.mapper.UsersMapper;
import com.mybatis.testMybatis.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersController {
    private UsersMapper usersMapper;

    public UsersController(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @GetMapping("/all")
    public List<Users> getAllUsers() {
        return usersMapper.findAllUsers();
    }
}
