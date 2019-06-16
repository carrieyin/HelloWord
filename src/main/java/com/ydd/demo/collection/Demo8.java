package com.ydd.demo.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo8 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("藏三");
		list.add("李四");
		
		list.addFirst("王五");
		list.addLast("小六");
		
//		System.out.println("元素" + list);
//		System.out.println("get first" + list.getFirst());
//		System.out.println("get last" + list.getLast());
//		System.out.println("remove " + list.remove());
//		
		list.push("狗剩");
		System.out.println("pop" + list.pop());
		System.out.println("元素" + list);
		
		list.offer("狗哇");
		System.out.println("元素" + list);
		
		Iterator it = list.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ",");
		}
		
	}

}
