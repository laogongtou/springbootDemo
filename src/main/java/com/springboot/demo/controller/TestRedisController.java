package com.springboot.demo.controller;

import com.springboot.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:GongBo
 * @Time:2019年1月4日 13:50:16
 * Description：reids Controller
 */
@RestController
@RequestMapping("/testRedis")
public class TestRedisController {
    @Autowired
    private RedisService redisService;

    @RequestMapping("/set")
    public void setTestRedis(String key, String value) {
        redisService.set(key, value, 10 * 60 * 1000L);
    }

    @RequestMapping("/get")
    public String getTestRedis(String key) {
        Object obj = redisService.get(key);
        if (!ObjectUtils.isEmpty(obj)) {
            return obj.toString();
        } else {
            return "";
        }
    }
}
