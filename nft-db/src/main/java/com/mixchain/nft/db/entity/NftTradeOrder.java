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
@TableName("nft_trade_order")
@ApiModel(value = "NftTradeOrder对象", description = "")
public class NftTradeOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("类型")
    private Boolean type;

    @ApiModelProperty("订单号")
    private String orderno;

    @ApiModelProperty("会员ID")
    private Integer userid;

    @ApiModelProperty("NFTid")
    private Integer nftid;

    @ApiModelProperty("出售金额")
    private BigDecimal money;

    @ApiModelProperty("手续费")
    private BigDecimal taxbl;

    @ApiModelProperty("到账金额")
    private BigDecimal amount;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("是否结算")
    private Boolean isf;

    @ApiModelProperty("创建日期")
    private Integer createtime;

    @ApiModelProperty("更新日期")
    private Integer updatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getNftid() {
        return nftid;
    }

    public void setNftid(Integer nftid) {
        this.nftid = nftid;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getTaxbl() {
        return taxbl;
    }

    public void setTaxbl(BigDecimal taxbl) {
        this.taxbl = taxbl;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsf() {
        return isf;
    }

    public void setIsf(Boolean isf) {
        this.isf = isf;
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
        return "NftTradeOrder{" +
        "id=" + id +
        ", type=" + type +
        ", orderno=" + orderno +
        ", userid=" + userid +
        ", nftid=" + nftid +
        ", money=" + money +
        ", taxbl=" + taxbl +
        ", amount=" + amount +
        ", status=" + status +
        ", isf=" + isf +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        "}";
    }
}
