package com.ydd.demo.proxy;

public class UserDao implements IUserDao, IPersonDao{

	public void save() {
		System.out.println("��������");
	}
	
	public void add(int index){
		System.out.println("������" + index);
	}

	@Override
	public void add() {
		System.out.println("���person");
	}
	
}
