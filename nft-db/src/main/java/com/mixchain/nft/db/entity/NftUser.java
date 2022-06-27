package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 会员表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_user")
@ApiModel(value = "NftUser对象", description = "会员表")
public class NftUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("组别ID")
    private Integer groupId;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("密码盐")
    private String salt;

    @ApiModelProperty("电子邮箱")
    private String email;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("等级")
    private Integer level;

    @ApiModelProperty("性别")
    private Integer gender;

    @ApiModelProperty("生日")
    private LocalDate birthday;

    @ApiModelProperty("格言")
    private String bio;

    @ApiModelProperty("余额")
    private BigDecimal money;

    @ApiModelProperty("冻结金额")
    private BigDecimal lockmoney;

    @ApiModelProperty("累计佣金")
    private BigDecimal commission;

    @ApiModelProperty("积分")
    private Integer score;

    @ApiModelProperty("连续登录天数")
    private Integer successions;

    @ApiModelProperty("最大连续登录天数")
    private Integer maxsuccessions;

    @ApiModelProperty("上次登录时间")
    private Integer prevtime;

    @ApiModelProperty("登录时间")
    private Integer logintime;

    @ApiModelProperty("登录IP")
    private String loginip;

    @ApiModelProperty("失败次数")
    private Integer loginfailure;

    @ApiModelProperty("加入IP")
    private String joinip;

    @ApiModelProperty("加入时间")
    private Integer jointime;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("更新时间")
    private Integer updatetime;

    @ApiModelProperty("Token")
    private String token;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("验证")
    private String verification;

    @ApiModelProperty("邀请码")
    private String invitecode;

    @ApiModelProperty("邀请人数")
    private Integer invitecount;

    @ApiModelProperty("上级ID")
    private Integer pid;

    @ApiModelProperty("支付密码")
    private String paypwd;

    @ApiModelProperty("谷歌密钥")
    private String gasecret;

    @ApiModelProperty("钱包地址")
    private String address;

    @ApiModelProperty("秘钥")
    private String secretkey;

    @ApiModelProperty("特殊会员")
    private Boolean isspecialuser;

    @ApiModelProperty("真实姓名")
    private String realname;

    @ApiModelProperty("身份证号")
    private String idnum;

    @ApiModelProperty("外部NFT数量")
    private Integer nftnum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getLockmoney() {
        return lockmoney;
    }

    public void setLockmoney(BigDecimal lockmoney) {
        this.lockmoney = lockmoney;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSuccessions() {
        return successions;
    }

    public void setSuccessions(Integer successions) {
        this.successions = successions;
    }

    public Integer getMaxsuccessions() {
        return maxsuccessions;
    }

    public void setMaxsuccessions(Integer maxsuccessions) {
        this.maxsuccessions = maxsuccessions;
    }

    public Integer getPrevtime() {
        return prevtime;
    }

    public void setPrevtime(Integer prevtime) {
        this.prevtime = prevtime;
    }

    public Integer getLogintime() {
        return logintime;
    }

    public void setLogintime(Integer logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public Integer getLoginfailure() {
        return loginfailure;
    }

    public void setLoginfailure(Integer loginfailure) {
        this.loginfailure = loginfailure;
    }

    public String getJoinip() {
        return joinip;
    }

    public void setJoinip(String joinip) {
        this.joinip = joinip;
    }

    public Integer getJointime() {
        return jointime;
    }

    public void setJointime(Integer jointime) {
        this.jointime = jointime;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public String getInvitecode() {
        return invitecode;
    }

    public void setInvitecode(String invitecode) {
        this.invitecode = invitecode;
    }

    public Integer getInvitecount() {
        return invitecount;
    }

    public void setInvitecount(Integer invitecount) {
        this.invitecount = invitecount;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPaypwd() {
        return paypwd;
    }

    public void setPaypwd(String paypwd) {
        this.paypwd = paypwd;
    }

    public String getGasecret() {
        return gasecret;
    }

    public void setGasecret(String gasecret) {
        this.gasecret = gasecret;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey;
    }

    public Boolean getIsspecialuser() {
        return isspecialuser;
    }

    public void setIsspecialuser(Boolean isspecialuser) {
        this.isspecialuser = isspecialuser;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public Integer getNftnum() {
        return nftnum;
    }

    public void setNftnum(Integer nftnum) {
        this.nftnum = nftnum;
    }

    @Override
    public String toString() {
        return "NftUser{" +
        "id=" + id +
        ", groupId=" + groupId +
        ", username=" + username +
        ", nickname=" + nickname +
        ", password=" + password +
        ", salt=" + salt +
        ", email=" + email +
        ", mobile=" + mobile +
        ", avatar=" + avatar +
        ", level=" + level +
        ", gender=" + gender +
        ", birthday=" + birthday +
        ", bio=" + bio +
        ", money=" + money +
        ", lockmoney=" + lockmoney +
        ", commission=" + commission +
        ", score=" + score +
        ", successions=" + successions +
        ", maxsuccessions=" + maxsuccessions +
        ", prevtime=" + prevtime +
        ", logintime=" + logintime +
        ", loginip=" + loginip +
        ", loginfailure=" + loginfailure +
        ", joinip=" + joinip +
        ", jointime=" + jointime +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", token=" + token +
        ", status=" + status +
        ", verification=" + verification +
        ", invitecode=" + invitecode +
        ", invitecount=" + invitecount +
        ", pid=" + pid +
        ", paypwd=" + paypwd +
        ", gasecret=" + gasecret +
        ", address=" + address +
        ", secretkey=" + secretkey +
        ", isspecialuser=" + isspecialuser +
        ", realname=" + realname +
        ", idnum=" + idnum +
        ", nftnum=" + nftnum +
        "}";
    }
}
