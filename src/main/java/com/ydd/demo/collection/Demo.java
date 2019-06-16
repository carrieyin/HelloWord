package com.ydd.demo.collection;

import java.util.LinkedList;

class StackList{
	LinkedList list;
	StackList() {
		list = new LinkedList();
	}
	
	void add(Object o) {
		list.push(o);
	}
	
	Object pop() {
		return list.pop();
	}
	
	int size() {
		return list.size();
	}
}

class TeamList{
	LinkedList list = new LinkedList();
	void add(Object o) {
		list.offer(o);
	}
	Object remove() {
		return list.poll();
	} 
	int size() {
		return list.size();
	}
	
}

public class Demo {

	public static void main(String[] args) {
		StackList stack = new StackList();
		stack.add("wangjianlin");
		stack.add("��γ�");
		stack.add("������");
//�˴������� list�����ڱ��		
//		for(int i = 0; i < stack.size(); i ++) {
//			System.out.println(stack.pop());
//		}
		int size = stack.size();
		for(int i = 0; i < size; i ++) {
			System.out.println(stack.pop());
		}
		
		TeamList tl = new TeamList();
		tl.add("wangjianlin");
		tl.add("��γ�");
		tl.add("������");
		
		size = tl.size();
		for(int i = 0; i < size; i ++) {
			System.out.println(tl.remove());
		}
		
	}
	

}
