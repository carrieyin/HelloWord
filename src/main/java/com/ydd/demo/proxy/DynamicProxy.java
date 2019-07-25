package com.ydd.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	private Object target ;
	public DynamicProxy(Object target){
		this.target = target ;
	}
	public  Object getProxyInstance() {// ���ɴ������
		ClassLoader classLoader = target.getClass().getClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();
		//MyInvocationHandler handler = new MyInvocationHandler(target) ;
		return Proxy.newProxyInstance(classLoader,
									  interfaces,
									  new InvocationHandler() {
										
										public Object invoke(Object proxy, Method method, Object[] args)
												throws Throwable {
										    System.out.println("------------����ʼ------------");
										    Object returnObj = method.invoke(target, args);
										    System.out.println("------------�������------------");
											return returnObj;
										}
									}) ;
	}
}


class MyInvocationHandler implements InvocationHandler{
	private Object target;
	public MyInvocationHandler(Object target){
		this.target = target ;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("����ʼ");
		Object returnValue = method.invoke(target, args);
		System.out.println("�������");
		return returnValue;
	}
}
