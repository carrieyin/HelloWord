package com.ydd.demo.common;

public class Demo1 {

	public static void main(String[] args) {
		test(3, 5, 6);
		
		//�Զ�װ��
		Integer a = 256;
		Integer b = 256;
		
		System.out.println("��ͬһ������ô��" + (a == b));
		
		System.out.println(Integer.parseInt("300"));
		System.out.println(Integer.parseInt("10", 8));
		Integer.toBinaryString(i)
	}

	public static void test(int... arg) {
		for(int item: arg) {
			System.out.println(item);
		}
	}
}
