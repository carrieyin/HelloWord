package com.ydd.demo.genericity;
class MyArrays{
	public static <T> void reverse(T[] arr) {
		for(int startIndex = 0, endIndex = arr.length - 1; startIndex < endIndex; startIndex++,endIndex--) {
			T temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
	}
	
	public static <T>String toString(T[] arr) {
		StringBuilder sb = new StringBuilder();
		for(T t : arr) {
			sb.append(t.toString() + ",");
		}
		return sb.toString();
	}
}
public class Demo3 {
	
	public static void main(String[] args) {
		String [] arr = {"abc", "567"};
		MyArrays.reverse(arr);
		System.out.println(MyArrays.toString(arr));
	}
}
