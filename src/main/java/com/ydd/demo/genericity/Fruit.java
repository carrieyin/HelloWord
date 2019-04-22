package com.ydd.demo.genericity;

public class Fruit {
	int price;
	int weight;
	public Fruit(int price, int weight) {
		this.price = price;
		this.weight = weight;
	}
	public Fruit() {
	}
}

class Apple extends Fruit{
	Apple(){
	}

	public String toString() {
		return "Apple []";
	}	
}

class Bonana extends Fruit{
	Bonana(){
		
	}

	public String toString() {
		return "Bonana []";
	}
	
	
}
