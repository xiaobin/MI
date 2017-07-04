package com.mi.module.base.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 *
 * 文章分类关联; InnoDB free: 3072 kB 实体
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@TableName("blog_article_type")
public class ArticleType extends Model<ArticleType> {

    private static final long serialVersionUID = 1L;

    /**
     * 文章主键
     */
    @TableId("article_id")
	private String articleId;
    /**
     * 标签主键
     */
	@TableField("type_id")
	private String typeId;
    /**
     * 标签名称
     */
	@TableField("type_name")
	private String typeName;


	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	protected Serializable pkVal() {
		return this.articleId;
	}

}
