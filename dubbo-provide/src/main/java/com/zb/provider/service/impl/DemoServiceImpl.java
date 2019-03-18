package com.zb.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.service.DemoService;

/**
 * Created by bzheng on 2019/3/18.
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello " + name + "（from springboot）";
    }
}
