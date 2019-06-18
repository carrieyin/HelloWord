package com.ydd.demo.set;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Emp emp1 = (Emp)o1;
		Emp emp2 = (Emp)o2;
		
		return emp1.id - emp2.id;
	}
	
}

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
		System.out.println(this.name + "compare: " + e.name);
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
		MyComparator comp = new MyComparator();
		TreeSet tr = new TreeSet(comp);
		tr.add(new Emp("小二", 110, 200));
		tr.add(new Emp("小三", 220, 700));
		tr.add(new Emp("小四", 10, 210));
		
		System.out.println(tr);
 
	}

}
