package com.ydd.demo.enumtest;

public enum Priorty {
	MAX(10), NORM(5), MINI(1);
	
	private int value;
	private Priorty(int value){
		this.value = value;
	}

	public int value(){
		return value;
	}
	
	public static void main(String[] args) {
		for (Priorty priorty : Priorty.values()) {
			System.out.printf("Priorty(%s, %d, %d) %n", priorty,priorty.ordinal(),priorty.value);
		}
	}
}
