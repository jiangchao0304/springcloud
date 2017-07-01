/*
* Copyright (c) 2016 bond. All Rights Reserved.
*/
package com.suzy.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: jiangchao@bond520.com
 * @Date: 2017-07-01 下午3:12
 */
@RestController
public class HomeController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name){
        return "hello "+ name +port;
    }


}

