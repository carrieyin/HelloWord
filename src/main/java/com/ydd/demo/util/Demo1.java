package com.ydd.demo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<String> c = new ArrayList<String>();
		c.add("900");
		c.add("67");
		c.add("90");
		Collections.sort(c);
		System.out.println("元素67在那个索引:" + Collections.binarySearch(c, "67"));
		System.out.println(c);
	}

}
