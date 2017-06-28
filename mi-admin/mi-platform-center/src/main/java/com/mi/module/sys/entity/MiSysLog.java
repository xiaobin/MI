package com.mi.module.sys.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 *
 * 操作日志; InnoDB free: 4096 kB 实体
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-06-28.
 */
@TableName("mi_sys_log")
public class MiSysLog extends Model<MiSysLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("log_id")
	private String logId;
    /**
     * 执行描述
     */
	private String description;
    /**
     * 操作者
     */
	private String username;
    /**
     * 执行时间
     */
	private Date dotime;
    /**
     * 路径
     */
	private String url;
    /**
     * 请求类型
     */
	private String method;
    /**
     * 参数
     */
	private String param;
    /**
     * IP地址
     */
	private String ip;
    /**
     * 结果
     */
	private String result;


	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDotime() {
		return dotime;
	}

	public void setDotime(Date dotime) {
		this.dotime = dotime;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	protected Serializable pkVal() {
		return this.logId;
	}

}
