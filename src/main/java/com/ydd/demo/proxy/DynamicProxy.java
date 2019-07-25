package com.ydd.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	private Object target ;
	public DynamicProxy(Object target){
		this.target = target ;
	}
	public  Object getProxyInstance() {// 生成代理对象
		ClassLoader classLoader = target.getClass().getClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();
		//MyInvocationHandler handler = new MyInvocationHandler(target) ;
		return Proxy.newProxyInstance(classLoader,
									  interfaces,
									  new InvocationHandler() {
										
										public Object invoke(Object proxy, Method method, Object[] args)
												throws Throwable {
										    System.out.println("------------事务开始------------");
										    Object returnObj = method.invoke(target, args);
										    System.out.println("------------事物结束------------");
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
		System.out.println("事务开始");
		Object returnValue = method.invoke(target, args);
		System.out.println("事务结束");
		return returnValue;
	}
}
