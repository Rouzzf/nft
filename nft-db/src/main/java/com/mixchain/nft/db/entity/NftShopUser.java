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
@TableName("nft_shop_user")
@ApiModel(value = "NftShopUser对象", description = "")
public class NftShopUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("会员ID")
    private Integer userid;

    @ApiModelProperty("首发ID")
    private Integer goodsid;

    @ApiModelProperty("编号")
    private Integer goodsno;

    @ApiModelProperty("图片")
    private String avatar;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("价格")
    private BigDecimal unitprice;

    @ApiModelProperty("合约地址")
    private String contract;

    @ApiModelProperty("网络")
    private String chain;

    @ApiModelProperty("详情")
    private String detail;

    @ApiModelProperty("故事")
    private String story;

    @ApiModelProperty("状态")
    private Boolean status;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("冻结单号")
    private String orderno;

    @ApiModelProperty("发行发")
    private String suename;

    @ApiModelProperty("是否认证")
    private Boolean isv;


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

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(Integer goodsno) {
        this.goodsno = goodsno;
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

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
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

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getSuename() {
        return suename;
    }

    public void setSuename(String suename) {
        this.suename = suename;
    }

    public Boolean getIsv() {
        return isv;
    }

    public void setIsv(Boolean isv) {
        this.isv = isv;
    }

    @Override
    public String toString() {
        return "NftShopUser{" +
        "id=" + id +
        ", userid=" + userid +
        ", goodsid=" + goodsid +
        ", goodsno=" + goodsno +
        ", avatar=" + avatar +
        ", title=" + title +
        ", unitprice=" + unitprice +
        ", contract=" + contract +
        ", chain=" + chain +
        ", detail=" + detail +
        ", story=" + story +
        ", status=" + status +
        ", createtime=" + createtime +
        ", orderno=" + orderno +
        ", suename=" + suename +
        ", isv=" + isv +
        "}";
    }
}
