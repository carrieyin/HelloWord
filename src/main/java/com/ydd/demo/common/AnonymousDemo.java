package com.ydd.demo.common;

public class AnonymousDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Dog extends Animal{

			public Dog(String name) {
				super(name);
			}

			public Animal run() {
				return this;
			}
			
		}
		
		Dog g = new Dog("��");
		g.run();
		
		
		new Animal("��"){
			public Animal run() {
				System.out.println("������");
				return this;
			}
			
			public void sleep(){
				System.out.println("����˯");
			}
			
		}.run().sleep();
		
		Animal a = new Animal("��"){
			public Animal run() {
				System.out.println("������");
				return this;
			}
			
			public void sleep(){
				System.out.println("����˯");
			}
			
			public void bit(){
				System.out.println("��ҧ��");
			}
			
		};
		
		a.run();
		a.sleep();
		//bit�޷����ã�ֻ���þֲ��ڲ�����
		
	}

}
