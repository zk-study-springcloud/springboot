package com.zk.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaokai
 * @date 2019/3/3 下午9:28
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "Greetings from Spring Boot";
    }
}
