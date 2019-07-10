package com.ydd.demo.copy;

public class Person implements Cloneable{
	String name;
	String id;
	Addr add;
	public Person(String name, String id, Addr addr) {
		super();
		this.name = name;
		this.id = id;
		this.add = addr;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ":" + id + ":" + add.city;
	}
}
