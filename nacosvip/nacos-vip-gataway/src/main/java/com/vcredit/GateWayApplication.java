package com.vcredit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: GateWayApplication
 * @Description: TODO (这里用一句话描述这个类的作用)
 * @author: Vampire
 * @date: 2019/9/30 11:38
 * @Copyright:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GateWayApplication {
    public static void main(String [] args){
        SpringApplication.run(GateWayApplication.class,args);
    }
}
