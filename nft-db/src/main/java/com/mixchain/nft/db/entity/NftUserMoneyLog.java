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
 * 会员余额变动表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_user_money_log")
@ApiModel(value = "NftUserMoneyLog对象", description = "会员余额变动表")
public class NftUserMoneyLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("会员ID")
    private Integer userId;

    @ApiModelProperty("变更余额")
    private BigDecimal money;

    @ApiModelProperty("变更前余额")
    private BigDecimal before;

    @ApiModelProperty("变更后余额")
    private BigDecimal after;

    @ApiModelProperty("备注")
    private String memo;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("类型")
    private Integer type;

    @ApiModelProperty("来源会员")
    private Integer fromuid;

    @ApiModelProperty("来源订单")
    private String fromorder;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getBefore() {
        return before;
    }

    public void setBefore(BigDecimal before) {
        this.before = before;
    }

    public BigDecimal getAfter() {
        return after;
    }

    public void setAfter(BigDecimal after) {
        this.after = after;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFromuid() {
        return fromuid;
    }

    public void setFromuid(Integer fromuid) {
        this.fromuid = fromuid;
    }

    public String getFromorder() {
        return fromorder;
    }

    public void setFromorder(String fromorder) {
        this.fromorder = fromorder;
    }

    @Override
    public String toString() {
        return "NftUserMoneyLog{" +
        "id=" + id +
        ", userId=" + userId +
        ", money=" + money +
        ", before=" + before +
        ", after=" + after +
        ", memo=" + memo +
        ", createtime=" + createtime +
        ", type=" + type +
        ", fromuid=" + fromuid +
        ", fromorder=" + fromorder +
        "}";
    }
}
