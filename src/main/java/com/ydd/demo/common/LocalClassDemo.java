package com.ydd.demo.common;

import com.ydd.demo.common.OutterClass.InnerClass;

public class LocalClassDemo {
	static int y = 20; //����Ϊstatic
	public static void main(String[] args) {
		final int a = 20; //����Ϊfinal
		class Inner{
			int x = 10;
			void print(){
				System.out.println("Inner ��Ա : " + x);
				System.out.println("�ֲ����� :" + a);
				System.out.println("��Ա����:" + y);
			}
			
		}
		Inner inner = new Inner();
		inner.print();
	}
}
