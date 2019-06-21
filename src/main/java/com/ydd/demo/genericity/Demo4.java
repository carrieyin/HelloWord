package com.ydd.demo.genericity;

class MyArray<T>{
	public void reverse(T[] arr) {
		for(int startIndex = 0, endIndex = arr.length - 1; startIndex < endIndex; startIndex++,endIndex--) {
			T temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
	}
	
}

public class Demo4 {

	public static void main(String[] args) {
		MyArray<String> array = new MyArray<String>();
		String[] arr = {"123", "89", "1"};
		array.reverse(arr);
	}

}
