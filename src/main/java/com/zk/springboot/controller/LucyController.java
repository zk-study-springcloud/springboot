package com.zk.springboot.controller;

import com.zk.springboot.configuration.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaokai
 * @date 2019/3/3 下午10:49
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class LucyController {
    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/lucy")
    public String miya() {
        return configBean.getGreeting() + "_" + configBean.getName() + "_" +
                configBean.getUuid() + "_" + configBean.getMax();
    }
}
