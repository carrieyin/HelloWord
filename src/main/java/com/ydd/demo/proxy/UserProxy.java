package com.ydd.demo.proxy;

public class UserProxy implements IUserDao{

	IUserDao dao;
	public UserProxy(IUserDao dao){
		this.dao = dao;
	}
	
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		UserProxy proxy = new UserProxy(dao);
		proxy.save();
	}

	public void save() {
		System.out.println("��ʼ����");
		dao.save();
		System.out.println("�ύ����");
	}

}
