package com.ydd.demo.common;

public class OutterClass {
	int x = 100;
	static class InnerClass{
		int x = 200;
		int i = 10;
		static int y = 300;
		public void print(){
			System.out.println("�����ڲ��෽��" + x);
			//System.out.println("�����ڲ��෽��" + OutterClass.this.x);

		}
	}
	
	void Instance(){
		InnerClass in = new InnerClass();
		in.print();
	}
}  
