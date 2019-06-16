package com.ydd.demo.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

class Poker{
	String color;
	String point;
	public Poker(String color, String point) {
		this.color = color;
		this.point = point;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color + point;
	}
	
	
}

public class Demo10 {
	
	public static LinkedList CreatPorkerList() {
		
		String[] color = {"梅花", "黑桃", "红桃", "方框"};
		String[] point = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q","k"};
		
		LinkedList list = new LinkedList();
		for(int i = 0; i < color.length; i++) {
			for(int j = 0; j < point.length; j++) {
				list.add(new Poker(color[i], point[j]));
			}
		}
		
		list.add(new Poker("大王", null));
		list.add(new Poker("小王", null));
		return list;
	}

	static void xipai(LinkedList list) {
			
		for(int i = 0; i < 100; i++) {
			Random rand = new Random();
			int index = rand.nextInt(list.size());
			int index1 = rand.nextInt(list.size());
			Object o = list.get(index);
			Object o1 = list.get(index1);
			
			list.set(index, o1);
			list.set(index1, o);
		}
		
		Iterator it = list.iterator();
		System.out.println("洗牌后");
		while(it.hasNext()) {
			System.out.print(it.next() + ",");
		}
	}
	public static void main(String[] args) {
		LinkedList list = CreatPorkerList();
		xipai(list);
	}

}
