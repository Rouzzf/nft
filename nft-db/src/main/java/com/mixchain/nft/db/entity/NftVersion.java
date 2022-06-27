package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 版本表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_version")
@ApiModel(value = "NftVersion对象", description = "版本表")
public class NftVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("旧版本号")
    private String oldversion;

    @ApiModelProperty("新版本号")
    private String newversion;

    @ApiModelProperty("包大小")
    private String packagesize;

    @ApiModelProperty("升级内容")
    private String content;

    @ApiModelProperty("下载地址")
    private String downloadurl;

    @ApiModelProperty("强制更新")
    private Integer enforce;

    @ApiModelProperty("创建时间")
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

    public String getOldversion() {
        return oldversion;
    }

    public void setOldversion(String oldversion) {
        this.oldversion = oldversion;
    }

    public String getNewversion() {
        return newversion;
    }

    public void setNewversion(String newversion) {
        this.newversion = newversion;
    }

    public String getPackagesize() {
        return packagesize;
    }

    public void setPackagesize(String packagesize) {
        this.packagesize = packagesize;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDownloadurl() {
        return downloadurl;
    }

    public void setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl;
    }

    public Integer getEnforce() {
        return enforce;
    }

    public void setEnforce(Integer enforce) {
        this.enforce = enforce;
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
        return "NftVersion{" +
        "id=" + id +
        ", oldversion=" + oldversion +
        ", newversion=" + newversion +
        ", packagesize=" + packagesize +
        ", content=" + content +
        ", downloadurl=" + downloadurl +
        ", enforce=" + enforce +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", weigh=" + weigh +
        ", status=" + status +
        "}";
    }
}
