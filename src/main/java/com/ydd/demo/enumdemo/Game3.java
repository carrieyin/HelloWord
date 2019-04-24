package com.ydd.demo.enumdemo;

public class Game3 {
	public static void play(Action3 action){
		action.excute();			
	}
	public static void main(String[] args) {
		Game3.play(Action3.RIGHT);
		Game3.play(Action3.DOWN);
	}
}
