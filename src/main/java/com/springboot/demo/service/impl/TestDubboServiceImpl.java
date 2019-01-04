package com.springboot.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.HelloDubboService;
import com.springboot.demo.service.TestDubboService;
import org.springframework.stereotype.Component;

@Component
public class TestDubboServiceImpl implements TestDubboService {

    @Reference
    private HelloDubboService helloDubboService;

    @Override
    public String showHelloDubbo() {
        return helloDubboService.testDubbo();
    }
}
