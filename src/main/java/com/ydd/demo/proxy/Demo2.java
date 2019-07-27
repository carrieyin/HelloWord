package com.ydd.demo.proxy;

public class Demo2 {

	public static void main(String[] args) {
		UserDao user = new UserDao();
		CglibFactory factory = new CglibFactory(user);
		UserDao userDaoProxy = (UserDao) factory.getProxyInstance();
		userDaoProxy.add();
		
	}

}
