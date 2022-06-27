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
@TableName("nft_network_nft")
@ApiModel(value = "NftNetworkNft对象", description = "")
public class NftNetworkNft implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("图片")
    private String avatar;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("tokenid")
    private Integer tokenid;

    @ApiModelProperty("合约")
    private String contract;

    @ApiModelProperty("钱包地址")
    private String address;

    @ApiModelProperty("状态")
    private Boolean status;

    @ApiModelProperty("创建日期")
    private Integer createtime;

    @ApiModelProperty("会员ID")
    private Integer userid;

    @ApiModelProperty("描述")
    private String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "NftNetworkNft{" +
        "id=" + id +
        ", avatar=" + avatar +
        ", title=" + title +
        ", tokenid=" + tokenid +
        ", contract=" + contract +
        ", address=" + address +
        ", status=" + status +
        ", createtime=" + createtime +
        ", userid=" + userid +
        ", description=" + description +
        "}";
    }
}
