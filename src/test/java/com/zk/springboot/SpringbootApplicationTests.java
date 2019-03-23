package com.zk.springboot;

import com.zk.springboot.redis.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    RedisDao redisDao;
    @Test
    public void testRedis() {
        redisDao.setKey("name","forezp");
        redisDao.setKey("age","17");
//        System.out.println(redisDao.getValue("name"));
//        System.out.println(redisDao.getValue("age"));
    }

}
