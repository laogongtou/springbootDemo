package com.springboot.demo.controller;

import com.springboot.demo.config.activemq.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testActive")
public class TestActiveMQController {

    @Autowired
    private Producer producer;

    @RequestMapping("/queue")
    public String queue() {

        for (int i = 0; i < 10; i++) {
            producer.sendQueue("queue" + i);
        }
        return "queue 发送成功";
    }

    @RequestMapping("/topic")
    public String topic() {

        for (int i = 0; i < 10; i++) {
            producer.sendTopic("topic" + i);
        }
        return "topic 发送成功";
    }
}
