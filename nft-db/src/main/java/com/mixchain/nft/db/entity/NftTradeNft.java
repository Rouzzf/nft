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
@TableName("nft_trade_nft")
@ApiModel(value = "NftTradeNft对象", description = "")
public class NftTradeNft implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("类型")
    private Boolean type;

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

    @ApiModelProperty("哈希值")
    private String hashval;

    @ApiModelProperty("发行发")
    private String suename;

    @ApiModelProperty("是否认证")
    private Boolean isv;

    @ApiModelProperty("热门")
    private Boolean ishot;

    @ApiModelProperty("销量排序")
    private Integer salenum;


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

    public String getHashval() {
        return hashval;
    }

    public void setHashval(String hashval) {
        this.hashval = hashval;
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

    public Boolean getIshot() {
        return ishot;
    }

    public void setIshot(Boolean ishot) {
        this.ishot = ishot;
    }

    public Integer getSalenum() {
        return salenum;
    }

    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }

    @Override
    public String toString() {
        return "NftTradeNft{" +
        "id=" + id +
        ", type=" + type +
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
        ", hashval=" + hashval +
        ", suename=" + suename +
        ", isv=" + isv +
        ", ishot=" + ishot +
        ", salenum=" + salenum +
        "}";
    }
}
