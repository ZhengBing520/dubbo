package com.zb.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by bzheng on 2019/3/18.
 */
@SpringBootApplication
@EnableDubbo
public class ConsumerApplication {

    public static void main(String[] args) {
        // 测试是否完成
        System.out.println("dddddddddd");
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
