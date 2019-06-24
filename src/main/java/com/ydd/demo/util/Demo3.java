package com.ydd.demo.util;

import java.util.Arrays;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		Integer[] arr = {5, 1, 78, 1};
		Integer[] arr2 = Arrays.copyOf(arr, 6);
		System.out.println("arr:" + Arrays.toString(arr));
		System.out.println("arr2:" + Arrays.toString(arr2));
		System.out.println(" «∑Òœ‡Õ¨:" + arr.equals(arr2));
		List<Integer> list = Arrays.asList(arr);
		System.out.println("list: " + list);
		list.toArray();
	}
	

}
