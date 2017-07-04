/*
* Copyright (c) 2016 bond. All Rights Reserved.
*/
package com.suzy.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: jiangchao@bond520.com
 * @Date: 2017-07-04 下午3:30
 */
@RestController
public class HomeController {

    @Value("${server.port}")
    String port;


    @RequestMapping("/order/info")
    @ResponseBody
    public Object orderInfo(@RequestParam String no){
        return no +" port:"+port;
    }
}

