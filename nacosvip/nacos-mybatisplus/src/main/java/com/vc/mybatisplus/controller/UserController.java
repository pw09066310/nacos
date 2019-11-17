package com.vc.mybatisplus.controller;

import com.vc.mybatisplus.domain.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author Vampire
 * @date 2018/7/18 14:58
 */
@RestController("user")
@Log4j2
public class UserController {

    @PostMapping("user")
    public String saveUser(@RequestBody User user) {
        log.info(user);
        user.insert();
        user.selectById();
        return "插入完毕";
    }
    @PostMapping("selectUser")
    public String selectUser() {
        User user=new User();
        user.setUserId(7026l);
        User user1 = user.selectById();
        return "插入完毕";
    }
}
