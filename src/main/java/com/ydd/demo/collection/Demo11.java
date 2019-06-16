package com.ydd.demo.collection;

import java.util.LinkedList;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ":" + age;
	}
}
public class Demo11 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Person("张三",35));
		list.add(new Person("小二",3));
		list.add(new Person("王五",17));

//		for(int i = 0; i < list.size(); i++) {
//			for(int j = i + 1; j < list.size(); j++) {
//				Person p1 = (Person) list.get(i);
//				Person p2 = (Person) list.get(j);
//				if(p1.age > p2.age){
//					list.set(i, p2);
//					list.set(j, p1);
//				}
//			}
//		}
		
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.size() - i - 1; j++) {
				Person p1 = (Person) list.get(j);
				Person p2 = (Person) list.get(j+1);
				if(p1.age > p2.age){
					list.set(j, p2);
					list.set(j + 1, p1);
			}
		}
		
		System.out.println(list);

	}
	}
}

