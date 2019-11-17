package com.vcredit.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MybatisPlusConfig
 * @Description: TODO (这里用一句话描述这个类的作用)
 * @author: Vampire
 * @date: 2019/9/10 15:19
 * @Copyright:
 */
@Configuration
@MapperScan("com.vcredit.mapper")
public class MybatisPlusConfig {
}
