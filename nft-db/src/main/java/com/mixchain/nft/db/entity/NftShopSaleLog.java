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
 * 竞拍历史记录
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_shop_sale_log")
@ApiModel(value = "NftShopSaleLog对象", description = "竞拍历史记录")
public class NftShopSaleLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("竞拍ID")
    private Integer goodsid;

    @ApiModelProperty("期数")
    private Integer snonum;

    @ApiModelProperty("满额人数")
    private Integer usernum;

    @ApiModelProperty("完成人数")
    private Integer finishnum;

    @ApiModelProperty("竞拍价格")
    private BigDecimal saleprice;

    @ApiModelProperty("创建日期")
    private Integer createtime;

    @ApiModelProperty("更新日期")
    private Integer updatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getSnonum() {
        return snonum;
    }

    public void setSnonum(Integer snonum) {
        this.snonum = snonum;
    }

    public Integer getUsernum() {
        return usernum;
    }

    public void setUsernum(Integer usernum) {
        this.usernum = usernum;
    }

    public Integer getFinishnum() {
        return finishnum;
    }

    public void setFinishnum(Integer finishnum) {
        this.finishnum = finishnum;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
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

    @Override
    public String toString() {
        return "NftShopSaleLog{" +
        "id=" + id +
        ", goodsid=" + goodsid +
        ", snonum=" + snonum +
        ", usernum=" + usernum +
        ", finishnum=" + finishnum +
        ", saleprice=" + saleprice +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        "}";
    }
}
