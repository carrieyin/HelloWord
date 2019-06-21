package com.ydd.demo.genericity;

interface BasicDao<T> {
	void creatsql(T t);
}

 class City implements BasicDao{

	public void creatsql(Object o) {
		System.out.println("sql test");
	}
	 
 }
 
 class ariport<T> implements BasicDao<T>{

	public void creatsql(T t) {
		
	}
	 
 }

public class Demo5 {

	public static void main(String[] args) {
		
	}

}
