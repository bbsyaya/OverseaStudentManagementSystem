package com.osms.entity;

import java.util.Date;

public class LoginBean {

	// ��¼�û���id
	private String loginName;
	// ��¼��ip��ַ
	private String ip;
	// ��¼ʱ��
	private Date loginTime;
	
	
	public String getLoginName() {
		return loginName;
	}
	
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	
	public String getIp() {
		return ip;
	}
	
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	public Date getLoginTime() {
		return loginTime;
	}
	
	
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
}
