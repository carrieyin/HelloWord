package com.ydd.demo.copy;

public class Demo1 {
	private static Demo1 demo1 ;
	
	public static Demo1 getInstance(){
		if(demo1== null){
			synchronized (Demo1.class) {
				if(demo1 == null){
					demo1 = new Demo1() ;
				}
			}
		}
		return demo1 ;
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Addr add = new Addr("pek");
		Person p = new Person("one", "1", add);
		Person p1 = (Person)p.clone();
		p1.name = "two";
		p1.add.city = "hk";
		
		System.out.println(p);
		System.out.println(p1);
		
	}
}
