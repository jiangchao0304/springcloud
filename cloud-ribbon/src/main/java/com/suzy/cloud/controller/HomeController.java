/*
* Copyright (c) 2016 bond. All Rights Reserved.
*/
package com.suzy.cloud.controller;

import com.suzy.cloud.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: jiangchao@bond520.com
 * @Date: 2017-07-04 上午11:27
 */
@RestController
public class HomeController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/userInfo")
    public String userInfo(@RequestParam String name){
        return userService.userInfo(name);
    }
}

