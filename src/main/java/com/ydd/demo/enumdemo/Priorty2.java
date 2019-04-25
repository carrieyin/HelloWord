package com.ydd.demo.enumdemo;

public enum Priorty2 {
	
	MAX(10){
		public String toString(){
			return String.format("%2d - 最大权限", value);			
		}
		
	},
	MIN(1){
		public String toString(){
			return String.format("%2d - 最小权限", value);			
		}
		
	};
	
	protected int value;
	Priorty2(int value){
		this.value = value;
	}
	
	public int value(){
		return value;
	}
	
	public static void main(String[] args) {
		for (Priorty2 prior : Priorty2.values()) {
			System.out.println(prior);
		}
	}
}
