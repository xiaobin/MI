package com.mi.module.base.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * 博客用户; InnoDB free: 3072 kB 实体
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@TableName("blog_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("user_id")
    private String userId;
    /**
     * 登录名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 登录密码
     */
    @TableField("user_pwd")
    private String userPwd;
    /**
     * 是否被禁用
     */
    private Integer enabled;
    /**
     * 凭证是否过期
     */
    private Integer credential;
    /**
     * 是否被锁
     */
    private Integer locked;
    /**
     * 是否过期
     */
    private Integer expired;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getCredential() {
        return credential;
    }

    public void setCredential(Integer credential) {
        this.credential = credential;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Integer getExpired() {
        return expired;
    }

    public void setExpired(Integer expired) {
        this.expired = expired;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return authorities;
    }
}
