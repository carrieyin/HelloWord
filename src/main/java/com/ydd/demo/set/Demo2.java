package com.ydd.demo.set;
//String���hashcode�����Ǹ����ַ����ɵ�
public class Demo2 {

	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = "hello";
		
		System.out.println("�����ַ�����ͬһ������ô��"+ str1==str2);
		System.out.println("�����ַ�����hashcode��ͬô��" + str1.hashCode() + ":" + str2.hashCode());
	}

}
