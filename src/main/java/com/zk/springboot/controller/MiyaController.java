package com.zk.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaokai
 * @date 2019/3/3 下午10:26
 */
@RestController
public class MiyaController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;
    @RequestMapping("/miya")
    public String miya() {
        return name + ":" + age;
    }
}
