package com.ydd.demo.db;

public class ClassInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = String.class;
		System.out.println("������  " + c.getName());
		System.out.println("�Ƿ�Ϊ��������   " + c.isPrimitive());
		System.out.println("��������   " + c.getSuperclass().getName());
	}

}
