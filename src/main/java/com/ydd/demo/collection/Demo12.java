package com.ydd.demo.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Demo12 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("����");
		v.addElement("����");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
