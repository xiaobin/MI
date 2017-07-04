package com.mi.module.base.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 *
 * 文章标签关联; InnoDB free: 3072 kB 实体
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@TableName("blog_article_tag")
public class ArticleTag extends Model<ArticleTag> {

    private static final long serialVersionUID = 1L;

    /**
     * 文章主键
     */
    @TableId("article_id")
	private String articleId;
    /**
     * 标签主键
     */
	@TableField("tag_id")
	private String tagId;
    /**
     * 标签名称
     */
	@TableField("tag_name")
	private String tagName;


	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	@Override
	protected Serializable pkVal() {
		return this.articleId;
	}

}
