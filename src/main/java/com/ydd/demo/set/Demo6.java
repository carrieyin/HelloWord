package com.ydd.demo.set;

import java.util.Iterator;
import java.util.TreeSet;

//string ¡°56 7 1 35 ¡±-------¡·¡°1 7 35 56¡±
public class Demo6 {

	public static void main(String[] args) {
		String str = "56 7 1 35";
		String[] datas = str.split(" ");
		TreeSet tree = new TreeSet();
		for(int i = 0; i < datas.length; i++) {
			tree.add(Integer.parseInt(datas[i]));
			
			
		}
		String s = "";
		Iterator it = tree.iterator();
		while(it.hasNext()) {
			s = s + " " + it.next();
		}
		
		System.out.println(s);
	}

}
