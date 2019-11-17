package com.vcredit;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName: NacosVipOrderApplication
 * @Description: TODO (这里用一句话描述这个类的作用)
 * @author: Vampire
 * @date: 2019/9/9 16:37
 * @Copyright:
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class NacosVipOrderApplication {
    public static void main(String [] args){
        SpringApplication.run(NacosVipOrderApplication.class,args);
    }
}
