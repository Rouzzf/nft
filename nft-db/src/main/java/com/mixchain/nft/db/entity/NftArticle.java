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
@TableName("nft_article")
@ApiModel(value = "NftArticle对象", description = "")
public class NftArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("排序")
    private Integer displayorder;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("类型")
    private Boolean type;

    @ApiModelProperty("语言ID")
    private Boolean langid;

    private String content;

    private Integer createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getLangid() {
        return langid;
    }

    public void setLangid(Boolean langid) {
        this.langid = langid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "NftArticle{" +
        "id=" + id +
        ", displayorder=" + displayorder +
        ", title=" + title +
        ", type=" + type +
        ", langid=" + langid +
        ", content=" + content +
        ", createtime=" + createtime +
        "}";
    }
}
