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
		
		Dog g = new Dog("狗");
		g.run();
		
		
		new Animal("狗"){
			public Animal run() {
				System.out.println("狗再跑");
				return this;
			}
			
			public void sleep(){
				System.out.println("狗再睡");
			}
			
		}.run().sleep();
		
		Animal a = new Animal("狗"){
			public Animal run() {
				System.out.println("狗再跑");
				return this;
			}
			
			public void sleep(){
				System.out.println("狗再睡");
			}
			
			public void bit(){
				System.out.println("狗咬人");
			}
			
		};
		
		a.run();
		a.sleep();
		//bit无法调用，只能用局部内部类解决
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
