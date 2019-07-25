package com.ydd.demo.proxy;

public class UserDao implements IUserDao{

	public void save() {
		System.out.println("保存数据");
	}
	
	public void add(int index){
		System.out.println("添加完成" + index);
	}
	
}
