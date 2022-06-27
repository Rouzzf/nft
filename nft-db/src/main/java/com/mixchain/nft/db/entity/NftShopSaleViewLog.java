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
@TableName("nft_shop_sale_view_log")
@ApiModel(value = "NftShopSaleViewLog对象", description = "")
public class NftShopSaleViewLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("会员ID")
    private Integer userid;

    @ApiModelProperty("竞拍ID")
    private Integer saleid;

    @ApiModelProperty("期数")
    private Integer snonum;

    @ApiModelProperty("创建日期")
    private Integer createtime;


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

    public Integer getSaleid() {
        return saleid;
    }

    public void setSaleid(Integer saleid) {
        this.saleid = saleid;
    }

    public Integer getSnonum() {
        return snonum;
    }

    public void setSnonum(Integer snonum) {
        this.snonum = snonum;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "NftShopSaleViewLog{" +
        "id=" + id +
        ", userid=" + userid +
        ", saleid=" + saleid +
        ", snonum=" + snonum +
        ", createtime=" + createtime +
        "}";
    }
}
