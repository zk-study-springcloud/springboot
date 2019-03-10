package com.zk.springboot.controller;

import com.zk.springboot.configuration.ConfigBean;
import com.zk.springboot.configuration.User;
import com.zk.springboot.configuration.UserYml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaokai
 * @date 2019/3/3 下午10:49
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class,User.class, UserYml.class})
public class LucyController {
    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/lucy")
    public String miya() {
        return configBean.getGreeting() + "_" + configBean.getName() + "_" +
                configBean.getUuid() + "_" + configBean.getMax();
    }
    @Autowired
    private User user;

    @RequestMapping("/user")
    public String user(){
        return user.getName() + ":" + user.getAge();
    }

    @Autowired
    private UserYml userYml;

    @RequestMapping("/userYml")
    public String userYml() {
        return userYml.getName() + ":" + userYml.getAge();
    }
}
