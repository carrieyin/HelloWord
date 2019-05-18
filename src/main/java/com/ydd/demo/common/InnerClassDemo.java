package com.ydd.demo.common;

public class InnerClassDemo {

	public static void main(String[] args) {
		OutterClass out = new OutterClass();
		out.Instance();
		
		//OutterClass.InnerClass inner = new OutterClass().new InnerClass();
		//inner.print();
		OutterClass.InnerClass inner = new OutterClass.InnerClass();
	}

}
