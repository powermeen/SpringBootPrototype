package com.shared;

import java.util.ArrayList;
import java.util.List;

public class LoginBean {

	private String userId;
	private String userName;
	private String password;
	private String role;
	private String status;
	
	private	List<PermissionBean> permissionBeans = new ArrayList<PermissionBean>();
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<PermissionBean> getPermissionBeans() {
		return permissionBeans;
	}
	public void setPermissionBeans(List<PermissionBean> permissionBeans) {
		this.permissionBeans = permissionBeans;
	}
}
