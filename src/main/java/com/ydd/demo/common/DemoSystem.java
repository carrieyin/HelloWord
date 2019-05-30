package com.ydd.demo.common;

import java.util.Arrays;

public class DemoSystem {
	public static void main(String[] args) {
		int[] srcArray = {2, 4, 6,8	};
		int[] destArray = {7, 9, 5, 0, 7};
		System.arraycopy(srcArray, 1, destArray, 2, 2);
		System.out.println(Arrays.toString(destArray));
		System.gc();
	
	}
	
}
