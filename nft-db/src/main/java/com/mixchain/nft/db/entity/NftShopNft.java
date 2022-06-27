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
@TableName("nft_shop_nft")
@ApiModel(value = "NftShopNft对象", description = "")
public class NftShopNft implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("发行发ID")
    private Integer issueid;

    @ApiModelProperty("系列ID")
    private Integer cateid;

    @ApiModelProperty("排序")
    private Integer displayorder;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("标签")
    private String label;

    @ApiModelProperty("封面")
    private String avatar;

    @ApiModelProperty("图片组")
    private String images;

    @ApiModelProperty("单价")
    private BigDecimal unitprice;

    @ApiModelProperty("发行数量")
    private Integer castnum;

    @ApiModelProperty("完成数量")
    private Integer finishnum;

    @ApiModelProperty("限购")
    private Integer maxnum;

    @ApiModelProperty("合约地址")
    private String contract;

    @ApiModelProperty("网络")
    private String chain;

    @ApiModelProperty("简介")
    private String desc;

    @ApiModelProperty("详情")
    private String detail;

    @ApiModelProperty("故事")
    private String story;

    @ApiModelProperty("热门")
    private Boolean ishot;

    @ApiModelProperty("首发")
    private Boolean isipo;

    @ApiModelProperty("广告")
    private Boolean isad;

    @ApiModelProperty("开始时间")
    private Integer starttime;

    @ApiModelProperty("结束时间")
    private Integer endtime;

    @ApiModelProperty("状态")
    private Boolean status;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("更新时间")
    private Integer updatetime;

    @ApiModelProperty("NFT编号")
    private String goodsno;

    @ApiModelProperty("预留数量")
    private Integer keepnum;

    @ApiModelProperty("赠送数量")
    private Integer keepsendnum;


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

    public Integer getCateid() {
        return cateid;
    }

    public void setCateid(Integer cateid) {
        this.cateid = cateid;
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getCastnum() {
        return castnum;
    }

    public void setCastnum(Integer castnum) {
        this.castnum = castnum;
    }

    public Integer getFinishnum() {
        return finishnum;
    }

    public void setFinishnum(Integer finishnum) {
        this.finishnum = finishnum;
    }

    public Integer getMaxnum() {
        return maxnum;
    }

    public void setMaxnum(Integer maxnum) {
        this.maxnum = maxnum;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public Boolean getIsipo() {
        return isipo;
    }

    public void setIsipo(Boolean isipo) {
        this.isipo = isipo;
    }

    public Boolean getIsad() {
        return isad;
    }

    public void setIsad(Boolean isad) {
        this.isad = isad;
    }

    public Integer getStarttime() {
        return starttime;
    }

    public void setStarttime(Integer starttime) {
        this.starttime = starttime;
    }

    public Integer getEndtime() {
        return endtime;
    }

    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
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

    public String getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(String goodsno) {
        this.goodsno = goodsno;
    }

    public Integer getKeepnum() {
        return keepnum;
    }

    public void setKeepnum(Integer keepnum) {
        this.keepnum = keepnum;
    }

    public Integer getKeepsendnum() {
        return keepsendnum;
    }

    public void setKeepsendnum(Integer keepsendnum) {
        this.keepsendnum = keepsendnum;
    }

    @Override
    public String toString() {
        return "NftShopNft{" +
        "id=" + id +
        ", issueid=" + issueid +
        ", cateid=" + cateid +
        ", displayorder=" + displayorder +
        ", title=" + title +
        ", label=" + label +
        ", avatar=" + avatar +
        ", images=" + images +
        ", unitprice=" + unitprice +
        ", castnum=" + castnum +
        ", finishnum=" + finishnum +
        ", maxnum=" + maxnum +
        ", contract=" + contract +
        ", chain=" + chain +
        ", desc=" + desc +
        ", detail=" + detail +
        ", story=" + story +
        ", ishot=" + ishot +
        ", isipo=" + isipo +
        ", isad=" + isad +
        ", starttime=" + starttime +
        ", endtime=" + endtime +
        ", status=" + status +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", goodsno=" + goodsno +
        ", keepnum=" + keepnum +
        ", keepsendnum=" + keepsendnum +
        "}";
    }
}
