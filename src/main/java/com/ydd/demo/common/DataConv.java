package com.ydd.demo.common;

public class DataConv {

	public static void main(String[] args) {
		//byte a = 200; //������Χ
		byte a = 20;
		System.out.println(a);
		System.out.println(1 +2 +3 + "hello " + 1 + 2 + 3); //+�����ַ���Ϊ���ӷ�
		System.out.println(10 % -3);
		System.out.println(-10 % -3); //ȡ���ڱ�����������
		int i = 0;
		i = i++;
		System.out.println(i);
		
		
		int c = 0; //0  1
		//int sum = ++c;	//c = c + 1; sum = a;
		int sum1 = c++;  //sum = 0; c = c + 1;
		System.out.println(sum1);
	}
}
