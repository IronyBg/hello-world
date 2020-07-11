package com.ling1.myapplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyApplicationTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test01(){
        stringRedisTemplate.opsForValue().set("name", "zhongcilanf");
        System.out.println(stringRedisTemplate.opsForValue().get("name"));
    }

}
