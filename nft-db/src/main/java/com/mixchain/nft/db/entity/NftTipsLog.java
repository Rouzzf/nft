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
@TableName("nft_tips_log")
@ApiModel(value = "NftTipsLog对象", description = "")
public class NftTipsLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("会员ID")
    private Integer userid;

    @ApiModelProperty("类型1:接收2:转赠")
    private Boolean type;

    @ApiModelProperty("状态-1:失败0:确认1:成功")
    private Boolean status;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("tokenid")
    private Integer tokenid;

    @ApiModelProperty("转出地址")
    private String fromaddress;

    @ApiModelProperty("转入地址")
    private String toaddress;

    @ApiModelProperty("订单编号")
    private String orderno;

    @ApiModelProperty("Txn Hash")
    private String txnhash;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("更新时间")
    private Integer updatetime;

    @ApiModelProperty("nftid")
    private Integer nftid;


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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTokenid() {
        return tokenid;
    }

    public void setTokenid(Integer tokenid) {
        this.tokenid = tokenid;
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

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getTxnhash() {
        return txnhash;
    }

    public void setTxnhash(String txnhash) {
        this.txnhash = txnhash;
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

    public Integer getNftid() {
        return nftid;
    }

    public void setNftid(Integer nftid) {
        this.nftid = nftid;
    }

    @Override
    public String toString() {
        return "NftTipsLog{" +
        "id=" + id +
        ", userid=" + userid +
        ", type=" + type +
        ", status=" + status +
        ", title=" + title +
        ", tokenid=" + tokenid +
        ", fromaddress=" + fromaddress +
        ", toaddress=" + toaddress +
        ", orderno=" + orderno +
        ", txnhash=" + txnhash +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", nftid=" + nftid +
        "}";
    }
}
