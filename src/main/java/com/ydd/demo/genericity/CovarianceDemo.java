package com.ydd.demo.genericity;

public class CovarianceDemo {
	
	public static void main(String[] args) {
		extendsTest();
		superTest();
		
		
	}

	private static void superTest() {
		Node<Apple> anode = new Node<Apple>(new Apple(), null);
		Node<? super Apple>  fnode = new Node<Fruit>(new Fruit(), null);
	}

	private static void extendsTest() {
		Node<Fruit> node = new Node<Fruit>(new Fruit(), null);
		show(node);
		//Node<Object>  objectNode = new Node<Integer>(1, null);
		Node<Apple> anode = new Node<Apple>(new Apple(), null);
		Node<Bonana> bnode = new Node<Bonana>(new Bonana(), null);
		Node<Bonana> b1node = new Node<Bonana>(new Bonana(), bnode);
		show(anode);
		show(b1node);
	}

	private static void show(Node<? extends Fruit> n) {
		Node<? extends Fruit> node = n;
		do{
			System.out.println(n.value.toString());	
			node = node.next;
		}while(node != null);
	}

}
