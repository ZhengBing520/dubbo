package com.zb.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zb.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bzheng on 2019/3/18.
 */
@RestController
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}")
    DemoService demoService;

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }
}
