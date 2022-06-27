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
@TableName("nft_shop_issue")
@ApiModel(value = "NftShopIssue对象", description = "")
public class NftShopIssue implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("认证")
    private Boolean isv;

    @ApiModelProperty("详情")
    private String detail;

    @ApiModelProperty("创建时间")
    private Integer createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsv() {
        return isv;
    }

    public void setIsv(Boolean isv) {
        this.isv = isv;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "NftShopIssue{" +
        "id=" + id +
        ", name=" + name +
        ", isv=" + isv +
        ", detail=" + detail +
        ", createtime=" + createtime +
        "}";
    }
}
