package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 管理员日志表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_admin_log")
@ApiModel(value = "NftAdminLog对象", description = "管理员日志表")
public class NftAdminLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("管理员ID")
    private Integer adminId;

    @ApiModelProperty("管理员名字")
    private String username;

    @ApiModelProperty("操作页面")
    private String url;

    @ApiModelProperty("日志标题")
    private String title;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("IP")
    private String ip;

    @ApiModelProperty("User-Agent")
    private String useragent;

    @ApiModelProperty("操作时间")
    private Integer createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "NftAdminLog{" +
        "id=" + id +
        ", adminId=" + adminId +
        ", username=" + username +
        ", url=" + url +
        ", title=" + title +
        ", content=" + content +
        ", ip=" + ip +
        ", useragent=" + useragent +
        ", createtime=" + createtime +
        "}";
    }
}
