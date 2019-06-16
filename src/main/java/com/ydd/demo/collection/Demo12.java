package com.ydd.demo.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Demo12 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("王五");
		v.addElement("李四");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
