package com.ydd.demo.common;

public class ThrowsDemo {

	public static void main(String[] args) throws Exception {
		int a = 4;
		int b = 2;
		div(a, b);
	}

	private static void div(int a, int b)throws Exception {
		if(b == 0){
			throw new Exception();
		}

		int c = a / b;
	}

}

