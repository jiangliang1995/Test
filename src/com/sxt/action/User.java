package com.sxt.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@¹¦ÄÜ£º
 *@Author JL
 *@Date 2018-3-30
 */
public class User extends ActionSupport {

		public String addUser()throws Exception{
			return "addUserSuccess";
		}
		public String deleteUser()throws Exception{
			return "deleteUserSuccess";
		}
		public String updataUser()throws Exception{
			return "updataUserSuccess";
		}
		public String selectUser()throws Exception{
			return "selectUserSuccess";
		}
		
		
		
}
