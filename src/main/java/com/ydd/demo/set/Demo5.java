package com.ydd.demo.set;

import java.util.TreeSet;

class Emp implements Comparable{
	String name;
	int id;
	int salary;
	public Emp(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Emp e = (Emp)o;
		return this.salary - e.salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ":" + id + ":" + salary;
	}
}
public class Demo5 {

	public static void main(String[] args) {
		TreeSet tr = new TreeSet();
		tr.add(new Emp("小二", 110, 200));
		tr.add(new Emp("小三", 220, 700));
		tr.add(new Emp("小四", 10, 210));
		
		System.out.println(tr);

	}

}
