package com.ydd.demo.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo8 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("����");
		list.add("����");
		
		list.addFirst("����");
		list.addLast("С��");
		
//		System.out.println("Ԫ��" + list);
//		System.out.println("get first" + list.getFirst());
//		System.out.println("get last" + list.getLast());
//		System.out.println("remove " + list.remove());
//		
		list.push("��ʣ");
		System.out.println("pop" + list.pop());
		System.out.println("Ԫ��" + list);
		
		list.offer("����");
		System.out.println("Ԫ��" + list);
		
		Iterator it = list.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ",");
		}
		
	}

}
