package com.sxt.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sxt.entity.User;

/**
 *
 *@功能：
 *@Author JL
 *@Date 2018-3-29
 */
public class Login2 extends ActionSupport implements ModelDriven {
	private User user =new User();
	
	/*public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public String execute() throws Exception {
		if("张三".equals(user.getUserName())&&"123".equals(user.getUserPwd())){
			return Action.SUCCESS;
		}else{
			
			return Action.ERROR;
		}
		
	}

	
}
