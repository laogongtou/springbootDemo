package com.springboot.demo.controller;

import com.springboot.demo.service.TestDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:GongBo
 * @Time:2018年12月26日 23:02:43
 * Description：dubbo Controller
 */
@RestController
@RequestMapping("/testDubbo")
public class TestDubboController {

    @Autowired
    private TestDubboService testDubboService;

    @RequestMapping("/helloDubbo")
    public String testDubbo(){
        return testDubboService.showHelloDubbo();
    }
}
