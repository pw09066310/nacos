package com.vcredit.mapper;

import com.vcredit.SuperMapper;
import com.vcredit.model.user.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: UserMapper
 * @Description: TODO (这里用一句话描述这个类的作用)
 * @author: Damon
 * @date: 2019/9/10 13:45
 * @Copyright:
 */
@Mapper
public interface UserMapper extends SuperMapper<User> {
}
