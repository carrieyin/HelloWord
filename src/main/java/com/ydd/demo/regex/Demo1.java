package com.ydd.demo.regex;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		//-------------------预定义字符------------------------ 
		System.out.println("%1".matches("."));
		System.out.println("%".matches("."));
		System.out.println("数字字符:" + "2".matches("\\d"));
		System.out.println("非数字字符:" + "%".matches("\\d"));
		System.out.println("空白字符:" + "\r".matches("\\s"));
		System.out.println("空白字符:" + "\r".matches("\\s"));
		System.out.println("单词字符:" + "_".matches("\\w"));
		//-------------------数量词----------------------------
		System.out.println("?:0次或1次" + "_".matches("\\w?"));
		System.out.println("*:0次或多次" + "_".matches("\\w*"));
		System.out.println("+:1次或多次" + "_".matches("\\w*"));
		System.out.println("+:两者之间" + "_".matches("\\w{2,3}"));
		//-------------------范围词-----------------------------
		System.out.println("abc".matches("[abc]{3}"));
		
		//-------------------切割-------------------------------
		String str = "明天   放假   了";
		String[] arr = str.split(" +");
		System.out.println(Arrays.toString(arr));
		
		//-------------------分组-------------------------------
		String str1 = "明天天  --- 放假假   了";
		String[] arr1 = str1.split("(.)\\1+");
		System.out.println(Arrays.toString(arr1));
		
		//-------------------替换-------------------------------
		String str2 = "我要要要做做做项目";
		System.out.println(str2 + "---替换后:" + str2.replaceAll("(.)\\1+","$1"));
	}
}
