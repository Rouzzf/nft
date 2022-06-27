package com.mixchain.nft.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 测试表
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@TableName("nft_test")
@ApiModel(value = "NftTest对象", description = "测试表")
public class NftTest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("会员ID")
    private Integer userId;

    @ApiModelProperty("管理员ID")
    private Integer adminId;

    @ApiModelProperty("分类ID(单选)")
    private Integer categoryId;

    @ApiModelProperty("分类ID(多选)")
    private String categoryIds;

    @ApiModelProperty("标签")
    private String tags;

    @ApiModelProperty("星期(单选):monday=星期一,tuesday=星期二,wednesday=星期三")
    private String week;

    @ApiModelProperty("标志(多选):hot=热门,index=首页,recommend=推荐")
    private String flag;

    @ApiModelProperty("性别(单选):male=男,female=女")
    private String genderdata;

    @ApiModelProperty("爱好(多选):music=音乐,reading=读书,swimming=游泳")
    private String hobbydata;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("图片")
    private String image;

    @ApiModelProperty("图片组")
    private String images;

    @ApiModelProperty("附件")
    private String attachfile;

    @ApiModelProperty("关键字")
    private String keywords;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("省市")
    private String city;

    @ApiModelProperty("配置:key=名称,value=值")
    private String json;

    @ApiModelProperty("二维数组:title=标题,intro=介绍,author=作者,age=年龄")
    private String multiplejson;

    @ApiModelProperty("价格")
    private BigDecimal price;

    @ApiModelProperty("点击")
    private Integer views;

    @ApiModelProperty("时间区间")
    private String workrange;

    @ApiModelProperty("开始日期")
    private LocalDate startdate;

    @ApiModelProperty("活动时间(datetime)")
    private LocalDateTime activitytime;

    @ApiModelProperty("年")
    private Year year;

    @ApiModelProperty("时间")
    private LocalTime times;

    @ApiModelProperty("刷新时间(int)")
    private Integer refreshtime;

    @ApiModelProperty("创建时间")
    private Integer createtime;

    @ApiModelProperty("更新时间")
    private Integer updatetime;

    @ApiModelProperty("删除时间")
    private Integer deletetime;

    @ApiModelProperty("权重")
    private Integer weigh;

    @ApiModelProperty("开关")
    @TableField(value = "switch")
    private Boolean iSwitch;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("状态值:0=禁用,1=正常,2=推荐")
    private String state;


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

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getGenderdata() {
        return genderdata;
    }

    public void setGenderdata(String genderdata) {
        this.genderdata = genderdata;
    }

    public String getHobbydata() {
        return hobbydata;
    }

    public void setHobbydata(String hobbydata) {
        this.hobbydata = hobbydata;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getAttachfile() {
        return attachfile;
    }

    public void setAttachfile(String attachfile) {
        this.attachfile = attachfile;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public String getMultiplejson() {
        return multiplejson;
    }

    public void setMultiplejson(String multiplejson) {
        this.multiplejson = multiplejson;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getWorkrange() {
        return workrange;
    }

    public void setWorkrange(String workrange) {
        this.workrange = workrange;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDateTime getActivitytime() {
        return activitytime;
    }

    public void setActivitytime(LocalDateTime activitytime) {
        this.activitytime = activitytime;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public LocalTime getTimes() {
        return times;
    }

    public void setTimes(LocalTime times) {
        this.times = times;
    }

    public Integer getRefreshtime() {
        return refreshtime;
    }

    public void setRefreshtime(Integer refreshtime) {
        this.refreshtime = refreshtime;
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

    public Integer getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Integer deletetime) {
        this.deletetime = deletetime;
    }

    public Integer getWeigh() {
        return weigh;
    }

    public void setWeigh(Integer weigh) {
        this.weigh = weigh;
    }

    public Boolean getSwitch() {
        return iSwitch;
    }

    public void setISwitch(Boolean iSwitch) {
        this.iSwitch = iSwitch;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "NftTest{" +
        "id=" + id +
        ", userId=" + userId +
        ", adminId=" + adminId +
        ", categoryId=" + categoryId +
        ", categoryIds=" + categoryIds +
        ", tags=" + tags +
        ", week=" + week +
        ", flag=" + flag +
        ", genderdata=" + genderdata +
        ", hobbydata=" + hobbydata +
        ", title=" + title +
        ", content=" + content +
        ", image=" + image +
        ", images=" + images +
        ", attachfile=" + attachfile +
        ", keywords=" + keywords +
        ", description=" + description +
        ", city=" + city +
        ", json=" + json +
        ", multiplejson=" + multiplejson +
        ", price=" + price +
        ", views=" + views +
        ", workrange=" + workrange +
        ", startdate=" + startdate +
        ", activitytime=" + activitytime +
        ", year=" + year +
        ", times=" + times +
        ", refreshtime=" + refreshtime +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", deletetime=" + deletetime +
        ", weigh=" + weigh +
        ", iSwitch=" + iSwitch +
        ", status=" + status +
        ", state=" + state +
        "}";
    }
}
