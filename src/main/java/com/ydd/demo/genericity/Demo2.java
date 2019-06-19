package com.ydd.demo.genericity;


interface Dao<T>{
	void add (T t) ;
}

public class Demo2 <T> implements Dao<T>{

	public static void main(String[] args) {

	}

	public void add(T t) {
		
	}
}
