package com.vcredit.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.alibaba.nacos.client.config.utils.JVMUtil.log;

/**
 * @ClassName: OrderController
 * @Description: TODO (这里用一句话描述这个类的作用)
 * @author: Vampire
 * @date: 2019/9/9 16:49
 * @Copyright:
 */
@RestController
public class OrderController {
    @GetMapping("/hello")
    public String hello(String name) {
        log.info("name:{}", name);
        return "hello " + name;
    }
}
