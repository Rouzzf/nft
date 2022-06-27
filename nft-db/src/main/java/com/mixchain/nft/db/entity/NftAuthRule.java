package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 节点表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_auth_rule")
@ApiModel(value = "NftAuthRule对象", description = "节点表")
public class NftAuthRule implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("menu为菜单,file为权限节点")
    private String type;

    @ApiModelProperty("父ID")
    private Integer pid;

    @ApiModelProperty("规则名称")
    private String name;

    @ApiModelProperty("规则名称")
    private String title;

    @ApiModelProperty("图标")
    private String icon;

    @ApiModelProperty("规则URL")
    private String url;

    @ApiModelProperty("条件")
    private String condition;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("是否为菜单")
    private Integer ismenu;

    @ApiModelProperty("菜单类型")
    private String menutype;

    @ApiModelProperty("扩展属性")
    private String extend;

    @ApiModelProperty("拼音首字母")
    private String py;

    @ApiModelProperty("拼音")
    private String pinyin;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(Integer ismenu) {
        this.ismenu = ismenu;
    }

    public String getMenutype() {
        return menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
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
        return "NftAuthRule{" +
        "id=" + id +
        ", type=" + type +
        ", pid=" + pid +
        ", name=" + name +
        ", title=" + title +
        ", icon=" + icon +
        ", url=" + url +
        ", condition=" + condition +
        ", remark=" + remark +
        ", ismenu=" + ismenu +
        ", menutype=" + menutype +
        ", extend=" + extend +
        ", py=" + py +
        ", pinyin=" + pinyin +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", weigh=" + weigh +
        ", status=" + status +
        "}";
    }
}
