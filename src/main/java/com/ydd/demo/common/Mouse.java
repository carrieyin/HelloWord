package com.ydd.demo.common;

public class Mouse extends Animal{
	
	

	public Mouse(String name) {
		super(name);
		
	}
	public Animal run() {
		System.out.println("��������");
		return this;
	}
	
	public void dig(){
		System.out.println("�����ڴ�");
	}

}
