package com.ydd.demo.collection;

import java.util.ArrayList;
import java.util.List;

public class demo5 {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("�Ա�ɽ");
		l.add("��ʣ");
		l.add("����");
		
        l.add(1, "����");
        
        List l2 = new ArrayList();
        l2.add("�Ա�ɽ");
        l2.add("С���� ");
        System.out.println("����Ԫ�أ�" + l);
        System.out.println("���ϵ�һ��Ԫ�أ�" + l.get(0));
        l.addAll(1,l2);
        System.out.println("����Ԫ�أ�" + l);
        System.out.println(l.indexOf("��ʣ"));
        System.out.println(l.lastIndexOf("��ʣ"));
        System.out.println("sub list" + l.subList(2, 4));
        

        
        
		
		
	}

}
