package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 附件表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_attachment")
@ApiModel(value = "NftAttachment对象", description = "附件表")
public class NftAttachment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("类别")
    private String category;

    @ApiModelProperty("管理员ID")
    private Integer adminId;

    @ApiModelProperty("会员ID")
    private Integer userId;

    @ApiModelProperty("物理路径")
    private String url;

    @ApiModelProperty("宽度")
    private String imagewidth;

    @ApiModelProperty("高度")
    private String imageheight;

    @ApiModelProperty("图片类型")
    private String imagetype;

    @ApiModelProperty("图片帧数")
    private Integer imageframes;

    @ApiModelProperty("文件名称")
    private String filename;

    @ApiModelProperty("文件大小")
    private Integer filesize;

    @ApiModelProperty("mime类型")
    private String mimetype;

    @ApiModelProperty("透传数据")
    private String extparam;

    @ApiModelProperty("创建日期")
    private Integer createtime;

    @ApiModelProperty("更新时间")
    private Integer updatetime;

    @ApiModelProperty("上传时间")
    private Integer uploadtime;

    @ApiModelProperty("存储位置")
    private String storage;

    @ApiModelProperty("文件 sha1编码")
    private String sha1;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImagewidth() {
        return imagewidth;
    }

    public void setImagewidth(String imagewidth) {
        this.imagewidth = imagewidth;
    }

    public String getImageheight() {
        return imageheight;
    }

    public void setImageheight(String imageheight) {
        this.imageheight = imageheight;
    }

    public String getImagetype() {
        return imagetype;
    }

    public void setImagetype(String imagetype) {
        this.imagetype = imagetype;
    }

    public Integer getImageframes() {
        return imageframes;
    }

    public void setImageframes(Integer imageframes) {
        this.imageframes = imageframes;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getExtparam() {
        return extparam;
    }

    public void setExtparam(String extparam) {
        this.extparam = extparam;
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

    public Integer getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Integer uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    @Override
    public String toString() {
        return "NftAttachment{" +
        "id=" + id +
        ", category=" + category +
        ", adminId=" + adminId +
        ", userId=" + userId +
        ", url=" + url +
        ", imagewidth=" + imagewidth +
        ", imageheight=" + imageheight +
        ", imagetype=" + imagetype +
        ", imageframes=" + imageframes +
        ", filename=" + filename +
        ", filesize=" + filesize +
        ", mimetype=" + mimetype +
        ", extparam=" + extparam +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", uploadtime=" + uploadtime +
        ", storage=" + storage +
        ", sha1=" + sha1 +
        "}";
    }
}
