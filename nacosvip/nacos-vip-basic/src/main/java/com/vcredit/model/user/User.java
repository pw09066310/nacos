package com.vcredit.model.user;



import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 */
@TableName("t_user")
public class User  extends Model<User> {
    @TableId(type = IdType.AUTO)
    private Long userId;
    /**
     * 外部渠道用户ID
     */
    private String thirdCustomerId;
    /**
     * 用户渠道来源
     */
    private Integer userSource;
    /**
     * 用户名称
     */
    private String userName;
    // 用户征信授权Token
    private String reportMemberToken;
    // 手机报告ID
    private String mobileReportId;
    // 用户身份证号
    private String userIdNo;
    /**
     * 用户手机号
     */
    private String userMobile;
    // 用户授信状态
    private Integer userCreditStatus;
    private Boolean valid;
    /**
     * 用户银行卡认证姓名
     */
    private String userBankIdName;
    /**
     * 用户银行卡认证身份证号
     */
    private String userBankIdNo;
    private Date createdTime;
    private Date updatedTime;

    public Integer getUserCreditStatus() {
        return userCreditStatus;
    }

    public void setUserCreditStatus(Integer userCreditStatus) {
        this.userCreditStatus = userCreditStatus;
    }

    public String getMobileReportId() {
        return mobileReportId;
    }

    public void setMobileReportId(String mobileReportId) {
        this.mobileReportId = mobileReportId;
    }

    public String getReportMemberToken() {
        return reportMemberToken;
    }

    public void setReportMemberToken(String reportMemberToken) {
        this.reportMemberToken = reportMemberToken;
    }

    public String getThirdCustomerId() {
        return thirdCustomerId;
    }

    public void setThirdCustomerId(String thirdCustomerId) {
        this.thirdCustomerId = thirdCustomerId;
    }

    public Integer getUserSource() {
        return userSource;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserIdNo() {
        return userIdNo;
    }

    public void setUserSource(Integer userSource) {
        this.userSource = userSource;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserIdNo(String userIdNo) {
        this.userIdNo = userIdNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserBankIdName() {
        return userBankIdName;
    }

    public void setUserBankIdName(String userBankIdName) {
        this.userBankIdName = userBankIdName;
    }

    public String getUserBankIdNo() {
        return userBankIdNo;
    }

    public void setUserBankIdNo(String userBankIdNo) {
        this.userBankIdNo = userBankIdNo;
    }

    public User() {}

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    public User(Long userId, String userName, String userIdNo, String userMobile) {
        this.userId = userId;
        this.userName = userName;
        this.userIdNo = userIdNo;
        this.userMobile = userMobile;
    }

    public User(Long userId, String userName, String userIdNo) {
        this.userId = userId;
        this.userName = userName;
        this.userIdNo = userIdNo;
    }

  /*  public static User convertUserResponseDataToUser(UserResponseDTO originalUser) {
        User user = new User();
        user.setThirdCustomerId(originalUser.getCustomerId() != null ? originalUser.getCustomerId() : "");
        user.setUserSource(originalUser.getUserSource());
        user.setUserName(originalUser.getUsername() != null ? originalUser.getUsername() : "");
        user.setUserIdNo(originalUser.getUserIdNo() != null ? originalUser.getUserIdNo() : "");
        user.setUserMobile(originalUser.getUserMobile() != null ? originalUser.getUserMobile() : "");
        user.setMobileReportId(originalUser.getMobileReportId() != null ? originalUser.getMobileReportId() : "");
        user.setUserCreditStatus(originalUser.getUserCreditStatus() != null ? originalUser.getUserCreditStatus() : UserCreditStatusEnums.NO_CREDIT.getValue());//默认未授信
        user.setValid(true);
        user.setCreatedTime(new Date());
        user.setUpdatedTime(new Date());

        return user;
    }*/
}
