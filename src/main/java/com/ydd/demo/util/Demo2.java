package com.ydd.demo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AgeComparator implements Comparator<Person>{
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.age - o2.age;
	}
	
}
class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:" + name + ",age:" + age;
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("狗娃", 20));
		personList.add(new Person("张三", 30));
		personList.add(new Person("李四", 15));
		personList.add(new Person("狗剩", 15));
		/*Collections.sort(personList, new AgeComparator()); //必须先sort再二分查找
		System.out.println(Collections.binarySearch(personList, new Person("李四",30), new AgeComparator()));
*/
		System.out.println("最大:" + Collections.max(personList, new AgeComparator()));
		System.out.println("最小:" + Collections.min(personList, new AgeComparator()));
		Collections.synchronizedList(personList);
	}

}
