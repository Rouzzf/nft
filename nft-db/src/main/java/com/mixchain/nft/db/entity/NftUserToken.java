package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 会员Token表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_user_token")
@ApiModel(value = "NftUserToken对象", description = "会员Token表")
public class NftUserToken implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("Token")
    private String token;

    @ApiModelProperty("会员ID")
    private Integer userId;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("过期时间")
    private Integer expiretime;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Integer getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(Integer expiretime) {
        this.expiretime = expiretime;
    }

    @Override
    public String toString() {
        return "NftUserToken{" +
        "token=" + token +
        ", userId=" + userId +
        ", createtime=" + createtime +
        ", expiretime=" + expiretime +
        "}";
    }
}
