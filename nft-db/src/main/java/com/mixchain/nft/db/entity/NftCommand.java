package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 在线命令表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_command")
@ApiModel(value = "NftCommand对象", description = "在线命令表")
public class NftCommand implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("参数")
    private String params;

    @ApiModelProperty("命令")
    private String command;

    @ApiModelProperty("返回结果")
    private String content;

    @ApiModelProperty("执行时间")
    private Integer executetime;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("更新时间")
    private Integer updatetime;

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

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getExecutetime() {
        return executetime;
    }

    public void setExecutetime(Integer executetime) {
        this.executetime = executetime;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NftCommand{" +
        "id=" + id +
        ", type=" + type +
        ", params=" + params +
        ", command=" + command +
        ", content=" + content +
        ", executetime=" + executetime +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", status=" + status +
        "}";
    }
}
