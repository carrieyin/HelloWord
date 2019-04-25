package com.ydd.demo.annotation;

import java.util.ArrayList;
import java.util.List;

public class Annotation extends Thread{
	@SuppressWarnings(value={"unchecked", "deprecation"})
	public static void main(String[] args) {
		Some1 s = new Some1();		
	    s.doSome();
	    s.testSome1();
	    List list = new ArrayList();
	    list.add("SOME");
	    System.out.println("end");
	}
	
	@Override
	public void run(){
		
	}	

}
