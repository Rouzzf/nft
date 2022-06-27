package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 会员积分变动表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_user_score_log")
@ApiModel(value = "NftUserScoreLog对象", description = "会员积分变动表")
public class NftUserScoreLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("会员ID")
    private Integer userId;

    @ApiModelProperty("变更积分")
    private Integer score;

    @ApiModelProperty("变更前积分")
    private Integer before;

    @ApiModelProperty("变更后积分")
    private Integer after;

    @ApiModelProperty("备注")
    private String memo;

    @ApiModelProperty("创建时间")
    private Integer createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getBefore() {
        return before;
    }

    public void setBefore(Integer before) {
        this.before = before;
    }

    public Integer getAfter() {
        return after;
    }

    public void setAfter(Integer after) {
        this.after = after;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "NftUserScoreLog{" +
        "id=" + id +
        ", userId=" + userId +
        ", score=" + score +
        ", before=" + before +
        ", after=" + after +
        ", memo=" + memo +
        ", createtime=" + createtime +
        "}";
    }
}
