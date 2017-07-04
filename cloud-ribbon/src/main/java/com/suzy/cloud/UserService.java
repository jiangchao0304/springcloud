/*
* Copyright (c) 2016 bond. All Rights Reserved.
*/
package com.suzy.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 类或方法的功能描述 :TODO
 *
 * @Author: jiangchao@bond520.com
 * @Date: 2017-07-04 上午11:16
 */
@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    public String userInfo(String name){
        return restTemplate.getForObject("http://userService/userInfo?name="+name,String.class);
    }
}

