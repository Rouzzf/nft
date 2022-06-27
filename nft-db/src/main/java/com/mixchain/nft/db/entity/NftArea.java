package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 地区表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_area")
@ApiModel(value = "NftArea对象", description = "地区表")
public class NftArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("父id")
    private Integer pid;

    @ApiModelProperty("简称")
    private String shortname;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("全称")
    private String mergename;

    @ApiModelProperty("层级:1=省,2=市,3=区/县")
    private Integer level;

    @ApiModelProperty("拼音")
    private String pinyin;

    @ApiModelProperty("长途区号")
    private String code;

    @ApiModelProperty("邮编")
    private String zip;

    @ApiModelProperty("首字母")
    private String first;

    @ApiModelProperty("经度")
    private String lng;

    @ApiModelProperty("纬度")
    private String lat;


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

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMergename() {
        return mergename;
    }

    public void setMergename(String mergename) {
        this.mergename = mergename;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "NftArea{" +
        "id=" + id +
        ", pid=" + pid +
        ", shortname=" + shortname +
        ", name=" + name +
        ", mergename=" + mergename +
        ", level=" + level +
        ", pinyin=" + pinyin +
        ", code=" + code +
        ", zip=" + zip +
        ", first=" + first +
        ", lng=" + lng +
        ", lat=" + lat +
        "}";
    }
}
