package com.sxt.entity;

import java.io.Serializable;

/**
 *
 *@���ܣ�
 *@Author JL
 *@Date 2018-3-29
 */
public class User implements Serializable {
	 private String userName;//����Ĭ�ϱ�����������������  ͬʱҲ�����ֵջ��
	 private String userPwd;
	 public User(){
		 
	 }
	 
     public User(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
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
}
