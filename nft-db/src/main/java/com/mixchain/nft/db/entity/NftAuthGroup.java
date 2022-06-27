package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 分组表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_auth_group")
@ApiModel(value = "NftAuthGroup对象", description = "分组表")
public class NftAuthGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("父组别")
    private Integer pid;

    @ApiModelProperty("组名")
    private String name;

    @ApiModelProperty("规则ID")
    private String rules;

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

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
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
        return "NftAuthGroup{" +
        "id=" + id +
        ", pid=" + pid +
        ", name=" + name +
        ", rules=" + rules +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", status=" + status +
        "}";
    }
}
