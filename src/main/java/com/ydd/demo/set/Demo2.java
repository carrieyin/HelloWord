package com.ydd.demo.set;
//String类的hashcode方法是根据字符生成的
public class Demo2 {

	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = "hello";
		
		System.out.println("两个字符串是同一个对象么？"+ str1==str2);
		System.out.println("两个字符串的hashcode相同么？" + str1.hashCode() + ":" + str2.hashCode());
	}

}
