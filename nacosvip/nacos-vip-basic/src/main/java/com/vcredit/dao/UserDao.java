package com.vcredit.dao;

import com.vcredit.model.user.User;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserDao
 * @Description: TODO (这里用一句话描述这个类的作用)
 * @author: Vampire
 * @date: 2019/9/10 20:24
 * @Copyright:
 */

@Repository
public class UserDao {
    public User selectUserById(Long userId){
        User user=new User();
        user.setUserId(userId);
        User user1 = user.selectById();
        return user1;
    }
}
