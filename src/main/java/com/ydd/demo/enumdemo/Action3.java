package com.ydd.demo.enumdemo;

public enum Action3 implements Command{
	STOP, RIGHT, LEFT, UP, DOWN;

	public void excute() {
		switch(this){
		case STOP:
			System.out.println("stop");
			break;
		case RIGHT:
			System.out.println("right");
			break;
		case LEFT:
			System.out.println("left");
			break;
		case UP:
			System.out.println("up");
			break;
		case DOWN:
			System.out.println("down");
			
		}
	}

}
