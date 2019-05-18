package com.ydd.demo.common;

public class OutterClass {
	int x = 100;
	static class InnerClass{
		int x = 200;
		int i = 10;
		static int y = 300;
		public void print(){
			System.out.println("这是内部类方法" + x);
			//System.out.println("这是内部类方法" + OutterClass.this.x);

		}
	}
	
	void Instance(){
		InnerClass in = new InnerClass();
		in.print();
	}
}  
