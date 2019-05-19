package com.ydd.demo.common;

public class Mouse extends Animal{
	
	

	public Mouse(String name) {
		super(name);
		
	}
	public Animal run() {
		System.out.println("老鼠在跑");
		return this;
	}
	
	public void dig(){
		System.out.println("老鼠在打洞");
	}

}
