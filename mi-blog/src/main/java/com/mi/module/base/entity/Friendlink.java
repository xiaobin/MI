package com.mi.module.base.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 *
 * 友情链接; InnoDB free: 3072 kB 实体
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@TableName("blog_friendlink")
public class Friendlink extends Model<Friendlink> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("flink_id")
	private String flinkId;
    /**
     * 站点名称
     */
	@TableField("size_name")
	private String sizeName;
    /**
     * 站点地址
     */
	@TableField("site_url")
	private String siteUrl;
    /**
     * 站点作者
     */
	@TableField("site_author")
	private String siteAuthor;
    /**
     * 站点描述
     */
	@TableField("site_desc")
	private String siteDesc;
    /**
     * 排序
     */
	private Integer sort;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;


	public String getFlinkId() {
		return flinkId;
	}

	public void setFlinkId(String flinkId) {
		this.flinkId = flinkId;
	}

	public String getSizeName() {
		return sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}

	public String getSiteUrl() {
		return siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public String getSiteAuthor() {
		return siteAuthor;
	}

	public void setSiteAuthor(String siteAuthor) {
		this.siteAuthor = siteAuthor;
	}

	public String getSiteDesc() {
		return siteDesc;
	}

	public void setSiteDesc(String siteDesc) {
		this.siteDesc = siteDesc;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.flinkId;
	}

}
