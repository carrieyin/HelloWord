package com.ydd.demo.common;

public class ThrowableDemo {

	public static void main(String[] args) {
		/*Throwable throwable = new Throwable("test");
		System.out.println(throwable.toString());
		System.out.println(throwable.getMessage());*/
		//test();
		byte [] b = new byte[1024 * 1024 * 1024];
		System.out.println("end");
	}

	private static void test() {
		Throwable throwable = new Throwable("test");
		throwable.printStackTrace();
	}

}
