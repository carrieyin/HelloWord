package com.ydd.demo.common;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		char[] arr = {'жа', 'Йњ', 'a', 's', 'd','m','p'};
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < 4; i++){
			Random r = new Random();
			int nextInt = r.nextInt(arr.length);
			s.append(arr[nextInt]);
			
		}
		
		System.out.println(s);
	}
}
