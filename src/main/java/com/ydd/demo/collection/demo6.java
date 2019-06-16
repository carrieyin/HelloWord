package com.ydd.demo.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class demo6 {

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("’‘±æ…Ω");
		l.add("π∑ £");
		l.add("π∑Õ€");
		
		ListIterator it = l.listIterator();
		
		//it.add("sunsun");
//		while(it.hasNext()) {
//			System.out.print(":" + it.next());
//		}
		
		it.add("xiaohong");
		it.next();
		it.next();
		
		System.out.println("ele is: " + l);
//		while(it.hasPrevious()) {
//			System.out.print( ":" + it.previous());
//		}
		
		//it.add("wawawa"); 
	}

}
