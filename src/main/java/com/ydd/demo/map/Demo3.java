package com.ydd.demo.map;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator<Book>{

	public int compare(Book o1, Book o2) {
		return o1.date.compareTo(o2.date);
	}
	
}

class Book{
	String name;
	String date;
	public Book(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}
	
	@Override
	public String toString() {
		
		return "[" + name + ":" + date + "]";
	}
}

public class Demo3 {

	public static void main(String[] args) {
		TreeMap<Book, String> treeMap = new TreeMap<Book, String>(new MyComparator());
		treeMap.put(new Book("java编程思想", "2019-06-22"), "java编程思想");
		treeMap.put(new Book("go编程思想", "2017-06-22"), "go编程思想");
		treeMap.put(new Book("elang编程思想", "2016-06-22"), "elang编程思想");
		System.out.println(treeMap);
	}

}
