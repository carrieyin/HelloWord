package com.ydd.demo.common;

import java.io.IOException;
import java.util.Properties;

public class SystemDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		System.gc();
		Properties properties = System.getProperties();
		properties.list(System.out);
		System.out.println(properties.getProperty("java.runtime.name"));
		Runtime runtime = Runtime.getRuntime();
		//runtime.exec("C:\\Program Files (x86)\\EditPlus 3");
		System.out.println(runtime.freeMemory());
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.totalMemory());
	}

}
