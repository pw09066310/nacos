package com.vc.mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 描述
 *
 * @author vampire
 * @date 2018/7/18 14:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
public class User extends Model<User> {
    @TableId(type = IdType.ID_WORKER_STR)
    private Long userId;
    /**
     * 外部渠道用户ID
     */
    private String thirdCustomerId;
    /**
     * 用户渠道来源
     */
    private Integer userSource;

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
