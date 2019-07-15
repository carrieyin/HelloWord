package com.ydd.demo.copy;

public class Demo1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Addr add = new Addr("pek");
		Person p = new Person("one", "1", add);
		Person p1 = (Person)p.clone();
		p1.name = "two";
		p1.add.city = "hk";
		
		System.out.println(p);
		System.out.println(p1);
		
	}
}
