package com.micro.service.galaxycollector.controller;

import com.micro.service.galaxycollector.common.ServerResponse;
import com.micro.service.galaxycollector.pojo.User;
import com.micro.service.galaxycollector.service.UserService;
import com.micro.service.galaxycollector.util.PasswordHelper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author ray
 * @date 2019/8/17 13:13
 */
@RestController
public class TestController {
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordHelper passwordHelper;

    @PostMapping("/test")
    public ServerResponse<?> test() {
        return ServerResponse.createBySuccess();
    }
}
