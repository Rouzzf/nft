package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_user_bank")
@ApiModel(value = "NftUserBank对象", description = "")
public class NftUserBank implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("会员ID")
    private Integer userid;

    @ApiModelProperty("类型1:充值2:提现")
    private Boolean type;

    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("联系电话")
    private String phone;

    @ApiModelProperty("真实姓名")
    private String realname;

    @ApiModelProperty("银行名称")
    private String bankname;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("绑卡ID")
    private String bindCardId;

    @ApiModelProperty("状态")
    private Boolean status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public String getBindCardId() {
        return bindCardId;
    }

    public void setBindCardId(String bindCardId) {
        this.bindCardId = bindCardId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NftUserBank{" +
        "id=" + id +
        ", userid=" + userid +
        ", type=" + type +
        ", account=" + account +
        ", phone=" + phone +
        ", realname=" + realname +
        ", bankname=" + bankname +
        ", createtime=" + createtime +
        ", bindCardId=" + bindCardId +
        ", status=" + status +
        "}";
    }
}
