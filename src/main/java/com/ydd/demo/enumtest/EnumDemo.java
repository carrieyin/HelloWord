package com.ydd.demo.enumtest;

public class EnumDemo {

	public static void main(String[] args) {
		Action2 action = Enum.valueOf(Action2.class, "UP");
		System.out.println(Action2.UP == action);
		Action2 ac = Action2.valueOf("UP");
		System.out.println(ac == Action2.UP);
	}

}
