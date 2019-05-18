package com.ydd.demo.common;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal a = new Mouse("¿œ Û");
		a.run();
		Mouse m = (Mouse) a;
		m.dig();
	}
	
	public static void print(Animal a){
		if (a instanceof Fish){
			Fish f = (Fish) a;
			f.bubble();
		}
		else if (a instanceof Mouse){
			Mouse m = (Mouse)a;
			m.dig();
		}
	}

}
