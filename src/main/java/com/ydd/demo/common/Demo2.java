package com.ydd.demo.common;

enum Sex{
	man("����"){

		@Override
		public void run() {
			
			System.out.println("��������");
			
		}
		
	}, woman("Ů��"){

		@Override
		public void run() {
			System.out.println("Ů������");
		}
		
	   
		
	};
	
	String value;
	Sex(String value){
		this.value = value;
	}
	String getString() {
		return value;
	}
	
	public abstract void run();
}

public class Demo2 {

	public static void main(String[] args) {
		
	}

}
