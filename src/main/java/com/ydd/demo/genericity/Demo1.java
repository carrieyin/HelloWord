package com.ydd.demo.genericity;

public class Demo1 {
	public static <T> T getData(T o) {
		return o;
	}

	public static void main(String[] args) {
		String s = getData("222");
		Integer i = getData(333);
		
		System.out.println(getData("abc"));
		System.out.println(getData(123));
		
	}

}
