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
@TableName("nft_shop_category")
@ApiModel(value = "NftShopCategory对象", description = "")
public class NftShopCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("发行方ID")
    private Integer issueid;

    @ApiModelProperty("排序")
    private Integer displayorder;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("封面")
    private String avatar;

    @ApiModelProperty("图片组")
    private String images;

    @ApiModelProperty("最低单价")
    private BigDecimal minprice;

    @ApiModelProperty("最高单价")
    private BigDecimal maxprice;

    @ApiModelProperty("合约地址")
    private String contract;

    @ApiModelProperty("网络")
    private String chain;

    @ApiModelProperty("详情")
    private String detail;

    @ApiModelProperty("故事")
    private String story;

    @ApiModelProperty("热门")
    private Boolean ishot;

    @ApiModelProperty("状态")
    private Boolean status;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("更新时间")
    private Integer updatetime;

    @ApiModelProperty("铸造时间")
    private Integer casttime;

    @ApiModelProperty("铸造数量")
    private Integer castnum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIssueid() {
        return issueid;
    }

    public void setIssueid(Integer issueid) {
        this.issueid = issueid;
    }

    public Integer getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public BigDecimal getMinprice() {
        return minprice;
    }

    public void setMinprice(BigDecimal minprice) {
        this.minprice = minprice;
    }

    public BigDecimal getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(BigDecimal maxprice) {
        this.maxprice = maxprice;
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

    public Boolean getIshot() {
        return ishot;
    }

    public void setIshot(Boolean ishot) {
        this.ishot = ishot;
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

    public Integer getCasttime() {
        return casttime;
    }

    public void setCasttime(Integer casttime) {
        this.casttime = casttime;
    }

    public Integer getCastnum() {
        return castnum;
    }

    public void setCastnum(Integer castnum) {
        this.castnum = castnum;
    }

    @Override
    public String toString() {
        return "NftShopCategory{" +
        "id=" + id +
        ", issueid=" + issueid +
        ", displayorder=" + displayorder +
        ", title=" + title +
        ", avatar=" + avatar +
        ", images=" + images +
        ", minprice=" + minprice +
        ", maxprice=" + maxprice +
        ", contract=" + contract +
        ", chain=" + chain +
        ", detail=" + detail +
        ", story=" + story +
        ", ishot=" + ishot +
        ", status=" + status +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", casttime=" + casttime +
        ", castnum=" + castnum +
        "}";
    }
}
