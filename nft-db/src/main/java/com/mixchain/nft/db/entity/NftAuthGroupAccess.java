package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 权限分组表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_auth_group_access")
@ApiModel(value = "NftAuthGroupAccess对象", description = "权限分组表")
public class NftAuthGroupAccess implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("会员ID")
    private Integer uid;

    @ApiModelProperty("级别ID")
    private Integer groupId;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "NftAuthGroupAccess{" +
        "uid=" + uid +
        ", groupId=" + groupId +
        "}";
    }
}
