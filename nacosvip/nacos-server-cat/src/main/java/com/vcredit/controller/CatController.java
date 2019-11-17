package com.vcredit.controller;



import com.vc.mybatisplus.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @ClassName: CatController
 * @Description: TODO (这里用一句话描述这个类的作用)
 * @author: Vampire
 * @date: 2019/9/9 18:07
 * @Copyright:
 */
@RestController("report")
public class CatController {


    @Autowired
    LoadBalancerClient loadBalancerClient;


    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-order-server");
        String url = serviceInstance.getUri() + "/hello?name=" + "zhangsan";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return "Invoke : " + url + ", return : " + result;
    }


    @GetMapping("/test2")
    @ResponseBody
    public String test2() {
        User user=new User();
        user.setUserId(2037l);
        User user1 = user.selectById();
        return user1.getThirdCustomerId();
    }







}
