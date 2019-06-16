package com.ydd.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Book{
	int id;
	String name;
	
	Book(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book b = (Book)obj;
		return id == b.id;
	}
	
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "id:" + id + "/name:" + name;
    }	
}

public class demo7 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		
		a.add(new Book(110,"java"));
		a.add(new Book(220,"c++"));
		a.add(new Book(330,"python"));
		a.add(new Book(110,"elang"));
		System.out.println("Ô­Êý×é£º" + a);
		System.out.println(checkRepeat(a));
		
	}
	
	public static ArrayList checkRepeat(ArrayList list) {
		ArrayList newlist = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			if(!newlist.contains(book)) {
				newlist.add(book);
			}
		}
		
		return newlist;
		
//		ListIterator it = list.listIterator();
//		while(it.hasNext()) {
//			Book book = (Book)it.next();
//			if(list.contains(book)) {
//				it.remove();
//			}
//		}
//		
//		return list;
		
	}

}
