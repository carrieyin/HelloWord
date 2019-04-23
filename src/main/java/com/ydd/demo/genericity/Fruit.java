package com.ydd.demo.genericity;

public class Fruit {
	int price;
	int weight;
	public Fruit(int price, int weight) {
		this.price = price;
		this.weight = weight;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Fruit() {
	}
}

class Apple extends Fruit{
	Apple(){
	}
	public Apple(int price, int weight) {
		this.price = price;
		this.weight = weight;
	}
	public String toString() {
		return "Apple []";
	}	
}

class Bonana extends Fruit{	
	Bonana(){
		
	}
	public Bonana(int price, int weight) {
		this.price = price;
		this.weight = weight;
	}
	
	public String toString() {
		return "Bonana []";
	}
	
}
