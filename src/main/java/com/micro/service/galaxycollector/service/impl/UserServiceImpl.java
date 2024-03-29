package com.micro.service.galaxycollector.service.impl;

import com.micro.service.galaxycollector.dao.RoleMapper;
import com.micro.service.galaxycollector.dao.UserMapper;
import com.micro.service.galaxycollector.pojo.Role;
import com.micro.service.galaxycollector.pojo.User;
import com.micro.service.galaxycollector.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Wang.Rui.Barney
 * @date 2024/01/22 13:39
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public User findUserByUsernamePassword(String username, String password) {
        return userMapper.findByUsernamePassword(username, password);
    }

    @Override
    public User findUserByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }

    @Override
    public void createUser(User user) {
        Role role = roleMapper.findRoleByName("Trellis Administrator");
        userMapper.createUser(user);

        long userId = user.getId();
        long roleId = role.getId();
        userMapper.createUserRole(userId, roleId);
    }
}
