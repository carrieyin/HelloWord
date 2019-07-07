package com.ydd.demo.common;

enum Sex{
	man("男人"){

		@Override
		public void run() {
			
			System.out.println("男人在跑");
			
		}
		
	}, woman("女人"){

		@Override
		public void run() {
			System.out.println("女人在跑");
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
