package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 系统配置
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_config")
@ApiModel(value = "NftConfig对象", description = "系统配置")
public class NftConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("变量名")
    private String name;

    @ApiModelProperty("分组")
    private String group;

    @ApiModelProperty("变量标题")
    private String title;

    @ApiModelProperty("变量描述")
    private String tip;

    @ApiModelProperty("类型:string,text,int,bool,array,datetime,date,file")
    private String type;

    @ApiModelProperty("可见条件")
    private String visible;

    @ApiModelProperty("变量值")
    private String value;

    @ApiModelProperty("变量字典数据")
    private String content;

    @ApiModelProperty("验证规则")
    private String rule;

    @ApiModelProperty("扩展属性")
    private String extend;

    @ApiModelProperty("配置")
    private String setting;


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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    @Override
    public String toString() {
        return "NftConfig{" +
        "id=" + id +
        ", name=" + name +
        ", group=" + group +
        ", title=" + title +
        ", tip=" + tip +
        ", type=" + type +
        ", visible=" + visible +
        ", value=" + value +
        ", content=" + content +
        ", rule=" + rule +
        ", extend=" + extend +
        ", setting=" + setting +
        "}";
    }
}
