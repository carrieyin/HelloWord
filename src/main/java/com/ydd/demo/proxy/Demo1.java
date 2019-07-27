package com.ydd.demo.proxy;

public class Demo1 {
	public static void main(String[] args) {
		IUserDao dao = new UserDao();
		IUserDao p = (IUserDao) new DynamicProxy(dao).getProxyInstance();
		
		p.save();
		
		//����jdk��֧��
		/*UserDao u = new UserDao();
		UserDao proxyInstance = (UserDao)new DynamicProxy(u).getProxyInstance();
		proxyInstance.save();
		proxyInstance.add(50);*/
	}

}
