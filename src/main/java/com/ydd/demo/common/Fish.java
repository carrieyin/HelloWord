package com.ydd.demo.common;

public class Fish extends Animal{

	public Fish(String name) {
		super(name);
	}

	public Animal run() {
		System.out.println(name + "����Ӿ");
		return this;
	}
	
	public void bubble(){
		System.out.println("������");
	}
	
}
