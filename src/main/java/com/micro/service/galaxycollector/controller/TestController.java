package com.micro.service.galaxycollector.controller;

import com.micro.service.galaxycollector.common.ServerResponse;
import com.micro.service.galaxycollector.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ray
 * @date 2019/8/17 13:13
 */
@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @PostMapping("/test")
    public ServerResponse<?> test() {
        return ServerResponse.createBySuccess();
    }
}
