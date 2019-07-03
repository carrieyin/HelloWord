package com.ydd.demo.regex;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		//-------------------Ԥ�����ַ�------------------------ 
		System.out.println("%1".matches("."));
		System.out.println("%".matches("."));
		System.out.println("�����ַ�:" + "2".matches("\\d"));
		System.out.println("�������ַ�:" + "%".matches("\\d"));
		System.out.println("�հ��ַ�:" + "\r".matches("\\s"));
		System.out.println("�հ��ַ�:" + "\r".matches("\\s"));
		System.out.println("�����ַ�:" + "_".matches("\\w"));
		//-------------------������----------------------------
		System.out.println("?:0�λ�1��" + "_".matches("\\w?"));
		System.out.println("*:0�λ���" + "_".matches("\\w*"));
		System.out.println("+:1�λ���" + "_".matches("\\w*"));
		System.out.println("+:����֮��" + "_".matches("\\w{2,3}"));
		//-------------------��Χ��-----------------------------
		System.out.println("abc".matches("[abc]{3}"));
		
		//-------------------�и�-------------------------------
		String str = "����   �ż�   ��";
		String[] arr = str.split(" +");
		System.out.println(Arrays.toString(arr));
		
		//-------------------����-------------------------------
		String str1 = "������  --- �żټ�   ��";
		String[] arr1 = str1.split("(.)\\1+");
		System.out.println(Arrays.toString(arr1));
		
		//-------------------�滻-------------------------------
		String str2 = "��ҪҪҪ��������Ŀ";
		System.out.println(str2 + "---�滻��:" + str2.replaceAll("(.)\\1+","$1"));
	}
}
