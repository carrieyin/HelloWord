package com.ydd.genericity.demo;

public class CovarianceDemo {
	
	public static void main(String[] args) {
		Node<Apple> anode = new Node<Apple>(new Apple(), null);
		Node<Bonana> bnode = new Node<Bonana>(new Bonana(), null);
		show(anode);
		show(bnode);
	}

	private static void show(Node<? extends Fruit> n) {
		System.out.println(n.value.toString());
	}

}
