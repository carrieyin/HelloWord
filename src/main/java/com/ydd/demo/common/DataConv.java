package com.ydd.demo.common;

public class DataConv {

	public static void main(String[] args) {
		//byte a = 200; //超出范围
		byte a = 20;
		System.out.println(a);
		System.out.println(1 +2 +3 + "hello " + 1 + 2 + 3); //+用于字符串为连接符
		System.out.println(10 % -3);
		System.out.println(-10 % -3); //取决于被除数的正负
		int i = 0;
		i = i++;
		System.out.println(i);
		
		
		int c = 0; //0  1
		//int sum = ++c;	//c = c + 1; sum = a;
		int sum1 = c++;  //sum = 0; c = c + 1;
		System.out.println(sum1);
	}
}
