package com.ydd.demo.db;

public class ClassInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = String.class;
		System.out.println("类名称  " + c.getName());
		System.out.println("是否为基本类型   " + c.isPrimitive());
		System.out.println("父类名称   " + c.getSuperclass().getName());
	}

}
