package com.ydd.demo.genericity;

import java.util.ArrayList;
import java.util.Set;

interface Dao<T>{
	void add (T t) ;
}

public class Demo2 <T> implements Dao<T>{

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr1 = new ArrayList();
		arr.add("abc");
		arr.add("cde");
		//arr.add(2);
		Set set ;
	}

	public void add(T t) {
		
	}
}
