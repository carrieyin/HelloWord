package com.ydd.demo.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibFactory {
	private Object target;
	
	public CglibFactory(Object target){
		this.target = target;
	}
	
	public Object getProxyInstance() {
		Enhancer en = new Enhancer();
		en.setSuperclass(target.getClass());
		en.setCallback(new MethodInterceptorImp(target));
		Object retObj =  en.create();
		return retObj ;
	}
}

class MethodInterceptorImp implements MethodInterceptor{

	private Object target;
	public MethodInterceptorImp(Object target) {
		this.target = target;
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("----start");
		Object retObj = method.invoke(target, args);
		System.out.println("----end");
		return retObj;
	}
	
}