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
@TableName("nft_shop_sale")
@ApiModel(value = "NftShopSale对象", description = "")
public class NftShopSale implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("系列ID")
    private Integer cateid;

    @ApiModelProperty("序号")
    private String title;

    @ApiModelProperty("当前期数")
    private Integer snonum;

    @ApiModelProperty("价格")
    private BigDecimal money;

    @ApiModelProperty("溢价比例")
    private BigDecimal yjbl;

    @ApiModelProperty("竞拍价格")
    private BigDecimal saleprice;

    @ApiModelProperty("排序")
    private Integer displayorder;

    @ApiModelProperty("围观人数")
    private Integer viewnum;

    @ApiModelProperty("参与人数")
    private Integer joinnum;

    @ApiModelProperty("满额人数")
    private Integer usernum;

    @ApiModelProperty("热门")
    private Boolean ishot;

    @ApiModelProperty("状态")
    private Boolean status;

    @ApiModelProperty("开始时间")
    private Integer starttime;

    @ApiModelProperty("结束时间")
    private Integer endtime;

    @ApiModelProperty("创建日期")
    private Integer createtime;

    @ApiModelProperty("是否锁定")
    private Boolean islock;

    @ApiModelProperty("锁定到期时间")
    private Integer locktime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCateid() {
        return cateid;
    }

    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSnonum() {
        return snonum;
    }

    public void setSnonum(Integer snonum) {
        this.snonum = snonum;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getYjbl() {
        return yjbl;
    }

    public void setYjbl(BigDecimal yjbl) {
        this.yjbl = yjbl;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public Integer getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }

    public Integer getViewnum() {
        return viewnum;
    }

    public void setViewnum(Integer viewnum) {
        this.viewnum = viewnum;
    }

    public Integer getJoinnum() {
        return joinnum;
    }

    public void setJoinnum(Integer joinnum) {
        this.joinnum = joinnum;
    }

    public Integer getUsernum() {
        return usernum;
    }

    public void setUsernum(Integer usernum) {
        this.usernum = usernum;
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

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Boolean getIslock() {
        return islock;
    }

    public void setIslock(Boolean islock) {
        this.islock = islock;
    }

    public Integer getLocktime() {
        return locktime;
    }

    public void setLocktime(Integer locktime) {
        this.locktime = locktime;
    }

    @Override
    public String toString() {
        return "NftShopSale{" +
        "id=" + id +
        ", cateid=" + cateid +
        ", title=" + title +
        ", snonum=" + snonum +
        ", money=" + money +
        ", yjbl=" + yjbl +
        ", saleprice=" + saleprice +
        ", displayorder=" + displayorder +
        ", viewnum=" + viewnum +
        ", joinnum=" + joinnum +
        ", usernum=" + usernum +
        ", ishot=" + ishot +
        ", status=" + status +
        ", starttime=" + starttime +
        ", endtime=" + endtime +
        ", createtime=" + createtime +
        ", islock=" + islock +
        ", locktime=" + locktime +
        "}";
    }
}
