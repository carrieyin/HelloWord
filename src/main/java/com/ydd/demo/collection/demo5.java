package com.ydd.demo.collection;

import java.util.ArrayList;
import java.util.List;

public class demo5 {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("赵本山");
		l.add("狗剩");
		l.add("狗哇");
		
        l.add(1, "李四");
        
        List l2 = new ArrayList();
        l2.add("赵本山");
        l2.add("小沈阳 ");
        System.out.println("集合元素：" + l);
        System.out.println("集合第一个元素：" + l.get(0));
        l.addAll(1,l2);
        System.out.println("集合元素：" + l);
        System.out.println(l.indexOf("狗剩"));
        System.out.println(l.lastIndexOf("狗剩"));
        System.out.println("sub list" + l.subList(2, 4));
        

        
        
		
		
	}

}
