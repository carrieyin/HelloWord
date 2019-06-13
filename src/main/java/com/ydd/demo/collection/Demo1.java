package com.ydd.demo.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
	
	public static void main(String[] args) {
		String[] s = new String[10];
		s[1] = "1";
		s[2] = "9";
		
		Collection c = new ArrayList();
		c.add("2");
		c.add(2);
		c.add("wanglin");
		c.add("周永康");
		
		Collection c1 = new ArrayList();
		c1.add("wanglin");
		c1.add("周永康");
		
		c.addAll(c1);
		System.out.println(c);
//		
//		//c.clear();
//		System.out.println(c);
//		
//		System.out.println("删除成功" + c.remove("wanglin"));
//		System.out.println(c);
//		
//		c.removeAll(c1);
//		System.out.println(c);
		c.retainAll(c1);
		System.out.println(c);
		
	}
}
