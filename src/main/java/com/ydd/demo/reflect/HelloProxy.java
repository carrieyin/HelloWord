package com.ydd.demo.reflect;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloProxy implements Hello{
	private Hello helloObj;

	
	public HelloProxy(Hello helloObj) {
		this.helloObj = helloObj;
	}

	public void hello(String name) {
		log("hello 方法开始");
		helloObj.hello(name);
		log("hello 方法结束");
	}

	private void log(String msg) {
		Logger logger = Logger.getLogger(HelloProxy.class.getName());
		logger.log(Level.INFO, msg);
		
	}
	

}
