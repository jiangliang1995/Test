package com.sxt.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.sxt.entity.User;

/**
 *
 *@���ܣ�
 *@Author JL
 *@Date 2018-3-29
 */
public class Login1 extends ActionSupport {
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		if("����".equals(user.getUserName())&&"123".equals(user.getUserPwd())){
			return Action.SUCCESS;
		}else{
			
			return Action.ERROR;
		}
		
	}
}
