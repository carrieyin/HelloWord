package com.ydd.demo.common;

//int length;
//char charat();
public class StringDemo {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		s.append("abc");
		s.append(true);
		s.append(3.1);
		s.insert(1, "xiaoming");
		s.delete(1, 5);
		//s.reverse();
		//s.ensureCapacity(20);
		s.toString();
		System.out.println("�ַ����ݳ���:" + s.capacity());
		System.out.println("�ַ�����������:" + s);
	}

}
