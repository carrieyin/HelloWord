package com.ydd.demo.common;

import com.ydd.demo.common.OutterClass.InnerClass;

public class LocalClassDemo {
	static int y = 20; //必须为static
	public static void main(String[] args) {
		final int a = 20; //必须为final
		class Inner{
			int x = 10;
			void print(){
				System.out.println("Inner 成员 : " + x);
				System.out.println("局部变量 :" + a);
				System.out.println("成员变量:" + y);
			}
			
		}
		Inner inner = new Inner();
		inner.print();
	}
}
