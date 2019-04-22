package com.ydd.demo.genericity;

public class SortDemo {

	public static void main(String[] args) {
		String[] strs = {"3", "5", "1"};
		for(String s :Sort.sorted(strs)){
			System.out.println(s);
		}
	}

}
