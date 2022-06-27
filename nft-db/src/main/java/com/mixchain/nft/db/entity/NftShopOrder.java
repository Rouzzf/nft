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
@TableName("nft_shop_order")
@ApiModel(value = "NftShopOrder对象", description = "")
public class NftShopOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("订单号")
    private String orderno;

    @ApiModelProperty("会员ID")
    private Integer userid;

    @ApiModelProperty("商品ID")
    private Integer goodsid;

    @ApiModelProperty("商品图片")
    private String goodsimg;

    @ApiModelProperty("商品标题")
    private String goodstitle;

    @ApiModelProperty("商品价格")
    private BigDecimal goodsprice;

    @ApiModelProperty("购买数量")
    private Integer buynum;

    @ApiModelProperty("支付总额")
    private BigDecimal amount;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("发行方")
    private String issuename;

    @ApiModelProperty("是否认证")
    private Boolean isv;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
    }

    public String getGoodstitle() {
        return goodstitle;
    }

    public void setGoodstitle(String goodstitle) {
        this.goodstitle = goodstitle;
    }

    public BigDecimal getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(BigDecimal goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public String getIssuename() {
        return issuename;
    }

    public void setIssuename(String issuename) {
        this.issuename = issuename;
    }

    public Boolean getIsv() {
        return isv;
    }

    public void setIsv(Boolean isv) {
        this.isv = isv;
    }

    @Override
    public String toString() {
        return "NftShopOrder{" +
        "id=" + id +
        ", orderno=" + orderno +
        ", userid=" + userid +
        ", goodsid=" + goodsid +
        ", goodsimg=" + goodsimg +
        ", goodstitle=" + goodstitle +
        ", goodsprice=" + goodsprice +
        ", buynum=" + buynum +
        ", amount=" + amount +
        ", createtime=" + createtime +
        ", issuename=" + issuename +
        ", isv=" + isv +
        "}";
    }
}
