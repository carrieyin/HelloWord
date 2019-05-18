package com.ydd.demo.common;

public abstract class Animal {
	String name;
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void run();
}
