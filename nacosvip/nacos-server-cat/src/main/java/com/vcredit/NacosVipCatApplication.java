package com.vcredit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: NacosVipCatApplication
 * @Description: TODO (这里用一句话描述这个类的作用)
 * @author: Vampire
 * @date: 2019/9/9 18:04
 * @Copyright:
 */
@SpringBootApplication
@EnableDiscoveryClient

@ComponentScan("com.vcredit")
@EnableAutoConfiguration()
public class NacosVipCatApplication {
    public static void main(String [] args){
        SpringApplication.run(NacosVipCatApplication.class,args);
    }
}
