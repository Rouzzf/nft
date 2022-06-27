package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("nft_user_cashout")
@ApiModel(value = "NftUserCashout对象", description = "")
public class NftUserCashout implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("会员ID")
    private Integer userid;

    @ApiModelProperty("类型")
    private Boolean type;

    @ApiModelProperty("提现金额")
    private BigDecimal amount;

    @ApiModelProperty("手续比例")
    private String cashrate;

    @ApiModelProperty("到账金额")
    private BigDecimal money;

    @ApiModelProperty("主体")
    private String bankname;

    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("姓名")
    private String realname;

    @ApiModelProperty("电话")
    private String phone;

    @ApiModelProperty("订单号")
    private String orderno;

    @ApiModelProperty("状态")
    private Boolean status;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("更新时间")
    private Integer updatetime;


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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCashrate() {
        return cashrate;
    }

    public void setCashrate(String cashrate) {
        this.cashrate = cashrate;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "NftUserCashout{" +
        "id=" + id +
        ", userid=" + userid +
        ", type=" + type +
        ", amount=" + amount +
        ", cashrate=" + cashrate +
        ", money=" + money +
        ", bankname=" + bankname +
        ", account=" + account +
        ", realname=" + realname +
        ", phone=" + phone +
        ", orderno=" + orderno +
        ", status=" + status +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        "}";
    }
}
