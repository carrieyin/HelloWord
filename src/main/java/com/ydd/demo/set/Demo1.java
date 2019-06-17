package com.ydd.demo.set;

import java.util.HashSet;
import java.util.Set;
class Person{
	int id;
	String name;
	Person(int id, String name){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		System.out.println(id + ":" + "name: "+ name + "   hash code ��������");
		//return super.hashCode();
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Person o = (Person)obj;
		System.out.println("equals is called");
		return o.id == id;
	}	
//	@Override
	public String toString() {
		
		return id + "," + name;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add("����");
		s.add("lisi");
		s.add("����");
		s.add(new Person(110, "xiaohong"));
		s.add(new Person(220, "��ʣ"));
		s.add(new Person(110, "�����"));
		System.out.println(s);
	}

}
