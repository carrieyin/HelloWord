package com.ydd.demo.proxy;

public class UserDao implements IUserDao{

	public void save() {
		System.out.println("��������");
	}
	
	public void add(int index){
		System.out.println("������" + index);
	}
	
}
