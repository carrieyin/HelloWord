package com.ydd.demo.common;

public class AnonymousDemo {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
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
		test();
	}

	
	
	
	public static void test(){
		
		for (int i = 0; i < 10; i++) {
			
			int a = 0 ;
			a++;
			System.out.printf("a:%d,",a);
			System.out.println();
			
			
			
		}
	}
}
