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
@TableName("nft_shop_ad")
@ApiModel(value = "NftShopAd对象", description = "")
public class NftShopAd implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("广告类型")
    private Boolean adtype;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("图片")
    private String avatar;

    @ApiModelProperty("参数ID")
    private Integer paramid;

    @ApiModelProperty("链接类型")
    private Boolean urltype;

    @ApiModelProperty("链接地址")
    private String url;

    @ApiModelProperty("添加时间")
    private Integer createtime;

    @ApiModelProperty("更新时间")
    private Integer updatetime;

    @ApiModelProperty("权重")
    private Integer weigh;

    @ApiModelProperty("状态")
    private String status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAdtype() {
        return adtype;
    }

    public void setAdtype(Boolean adtype) {
        this.adtype = adtype;
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

    public Integer getParamid() {
        return paramid;
    }

    public void setParamid(Integer paramid) {
        this.paramid = paramid;
    }

    public Boolean getUrltype() {
        return urltype;
    }

    public void setUrltype(Boolean urltype) {
        this.urltype = urltype;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Integer getWeigh() {
        return weigh;
    }

    public void setWeigh(Integer weigh) {
        this.weigh = weigh;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NftShopAd{" +
        "id=" + id +
        ", adtype=" + adtype +
        ", title=" + title +
        ", avatar=" + avatar +
        ", paramid=" + paramid +
        ", urltype=" + urltype +
        ", url=" + url +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", weigh=" + weigh +
        ", status=" + status +
        "}";
    }
}
