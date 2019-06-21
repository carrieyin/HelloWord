package com.ydd.demo.genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo6 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("1");
		array.add("80");
		
		ArrayList<Number> array1 = new ArrayList<Number>();
		
		//print(array);
		print(array1);

	}
	
	public static void print(Collection<? super Integer> c) {
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ",");
		}
	}
	
	public static void print1(Collection<? extends Integer> c) {
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ",");
		}
	}

}
