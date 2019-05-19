package com.ydd.demo.common;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		div(a, b);
	}

	private static void div(int a, int b) {
		try{
			int c =  a / b;
		}catch(ArithmeticException e){
			System.out.println("message" + e.toString());
		}
		
	}

}
