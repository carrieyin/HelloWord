package com.ydd.demo.common;

public class Fish extends Animal{

	public Fish(String name) {
		super(name);
	}

	public void run() {
		System.out.println(name + "����Ӿ");
	}
	
	public void bubble(){
		System.out.println("������");
	}
	
}
