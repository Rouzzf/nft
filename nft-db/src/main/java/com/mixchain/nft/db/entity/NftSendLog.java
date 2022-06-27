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
@TableName("nft_send_log")
@ApiModel(value = "NftSendLog对象", description = "")
public class NftSendLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("会员ID")
    private Integer userid;

    @ApiModelProperty("发送地址")
    private String fromaddress;

    @ApiModelProperty("接收地址")
    private String toaddress;

    @ApiModelProperty("NFTID")
    private Integer nftid;

    @ApiModelProperty("状态")
    private Boolean status;

    private Integer createtime;

    private Integer updatetime;

    @ApiModelProperty("冻结金额")
    private BigDecimal lockmoney;

    @ApiModelProperty("Txn Hash")
    private String txnhash;


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

    public String getFromaddress() {
        return fromaddress;
    }

    public void setFromaddress(String fromaddress) {
        this.fromaddress = fromaddress;
    }

    public String getToaddress() {
        return toaddress;
    }

    public void setToaddress(String toaddress) {
        this.toaddress = toaddress;
    }

    public Integer getNftid() {
        return nftid;
    }

    public void setNftid(Integer nftid) {
        this.nftid = nftid;
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

    public BigDecimal getLockmoney() {
        return lockmoney;
    }

    public void setLockmoney(BigDecimal lockmoney) {
        this.lockmoney = lockmoney;
    }

    public String getTxnhash() {
        return txnhash;
    }

    public void setTxnhash(String txnhash) {
        this.txnhash = txnhash;
    }

    @Override
    public String toString() {
        return "NftSendLog{" +
        "id=" + id +
        ", userid=" + userid +
        ", fromaddress=" + fromaddress +
        ", toaddress=" + toaddress +
        ", nftid=" + nftid +
        ", status=" + status +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", lockmoney=" + lockmoney +
        ", txnhash=" + txnhash +
        "}";
    }
}
