package com.sxt.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@���ܣ�
 *@Author JL
 *@Date 2018-3-29
 */
public class Login extends ActionSupport {
	 private String userName;//����Ĭ�ϱ�����������������  ͬʱҲ�����ֵջ��
	 private String userPwd;
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
   @Override
 	public String execute() throws Exception {
	// TODO Auto-generated method stub
	if("����".equals(userName)&&("123".equals(userPwd))){
		return Action.SUCCESS;
	}else{
		return Action.ERROR;
	}
	
}
}
