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
@TableName("nft_shop_sale_order")
@ApiModel(value = "NftShopSaleOrder对象", description = "")
public class NftShopSaleOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("类型")
    private Boolean type;

    @ApiModelProperty("订单号")
    private String orderno;

    @ApiModelProperty("会员ID")
    private Integer userid;

    @ApiModelProperty("商品ID")
    private Integer goodsid;

    @ApiModelProperty("期数")
    private String saleno;

    @ApiModelProperty("当前期数")
    private Integer snonum;

    @ApiModelProperty("价格")
    private BigDecimal unitprice;

    @ApiModelProperty("系列ID")
    private Integer cateid;

    @ApiModelProperty("系列")
    private String goodstitle;

    @ApiModelProperty("合约地址")
    private String contract;

    @ApiModelProperty("图片")
    private String goodsimg;

    @ApiModelProperty("购买数量")
    private Integer buynum;

    @ApiModelProperty("支付总额")
    private BigDecimal amount;

    @ApiModelProperty("状态")
    private Boolean status;

    @ApiModelProperty("是否结算")
    private Boolean isf;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("更新时间")
    private Integer updatetime;

    @ApiModelProperty("匹配订单")
    private String ids;

    @ApiModelProperty("排队号")
    private String upno;

    @ApiModelProperty("手续费")
    private BigDecimal taxbl;


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

    public String getSaleno() {
        return saleno;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno;
    }

    public Integer getSnonum() {
        return snonum;
    }

    public void setSnonum(Integer snonum) {
        this.snonum = snonum;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getCateid() {
        return cateid;
    }

    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }

    public String getGoodstitle() {
        return goodstitle;
    }

    public void setGoodstitle(String goodstitle) {
        this.goodstitle = goodstitle;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getIsf() {
        return isf;
    }

    public void setIsf(Boolean isf) {
        this.isf = isf;
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

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getUpno() {
        return upno;
    }

    public void setUpno(String upno) {
        this.upno = upno;
    }

    public BigDecimal getTaxbl() {
        return taxbl;
    }

    public void setTaxbl(BigDecimal taxbl) {
        this.taxbl = taxbl;
    }

    @Override
    public String toString() {
        return "NftShopSaleOrder{" +
        "id=" + id +
        ", type=" + type +
        ", orderno=" + orderno +
        ", userid=" + userid +
        ", goodsid=" + goodsid +
        ", saleno=" + saleno +
        ", snonum=" + snonum +
        ", unitprice=" + unitprice +
        ", cateid=" + cateid +
        ", goodstitle=" + goodstitle +
        ", contract=" + contract +
        ", goodsimg=" + goodsimg +
        ", buynum=" + buynum +
        ", amount=" + amount +
        ", status=" + status +
        ", isf=" + isf +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", ids=" + ids +
        ", upno=" + upno +
        ", taxbl=" + taxbl +
        "}";
    }
}
