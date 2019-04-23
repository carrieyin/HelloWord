package com.ydd.demo.genericity;

import java.util.Comparator;

public class ContravarianceDemo {

	public static void main(String[] args) {
		
		Comparator<Fruit> priceComparator = new Comparator<Fruit>(){
			public int compare(Fruit o1, Fruit o2) {
				return o1.price - o2.price;
			}
		};
		
		Basket<Apple> apples = new Basket<Apple>(new Apple(25, 150), new Apple(20, 100));
		apples.sort(priceComparator);
		
		for(Apple apple: apples.things){
			System.out.printf("APPLE(%s, %s)", apple.price, apple.weight);
		}
	}

}
