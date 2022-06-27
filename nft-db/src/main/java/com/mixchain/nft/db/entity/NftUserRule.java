package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 会员规则表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_user_rule")
@ApiModel(value = "NftUserRule对象", description = "会员规则表")
public class NftUserRule implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("父ID")
    private Integer pid;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("是否菜单")
    private Boolean ismenu;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(Boolean ismenu) {
        this.ismenu = ismenu;
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
        return "NftUserRule{" +
        "id=" + id +
        ", pid=" + pid +
        ", name=" + name +
        ", title=" + title +
        ", remark=" + remark +
        ", ismenu=" + ismenu +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", weigh=" + weigh +
        ", status=" + status +
        "}";
    }
}
