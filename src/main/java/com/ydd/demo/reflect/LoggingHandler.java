package com.ydd.demo.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingHandler implements InvocationHandler{
	private Object target;
	public Object bind(Object obj){
		this.target = obj;
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				this);
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		log(String.format("%s() 網請羲宎...", method.getName()));
		result = method.invoke(target, args);
		log(String.format("%s() 網請賦旰", method.getName()));
		return result;
	}

	private void log(String message) {
		Logger.getLogger(LoggingHandler.class.getName()).log(Level.INFO, message);
	}

}
