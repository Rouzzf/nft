package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 邮箱验证码表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_ems")
@ApiModel(value = "NftEms对象", description = "邮箱验证码表")
public class NftEms implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("事件")
    private String event;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("验证码")
    private String code;

    @ApiModelProperty("验证次数")
    private Integer times;

    @ApiModelProperty("IP")
    private String ip;

    @ApiModelProperty("创建时间")
    private Integer createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "NftEms{" +
        "id=" + id +
        ", event=" + event +
        ", email=" + email +
        ", code=" + code +
        ", times=" + times +
        ", ip=" + ip +
        ", createtime=" + createtime +
        "}";
    }
}
