package com.ydd.demo.common;

public class Circle {
	public final double pi = 3.14 ;
	public double r;
	public Circle(double r){
		this.r = r;
	}

	public double getArea(){
		return r * r * pi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Circle c = new Circle(4);
		//c = new Circle(5); //´íÎó
		System.out.println("main C: " + c.getArea());
		test(c);
		
	}

	public static void test(Circle c)
	{
		c = new Circle(5);
		System.out.println("main C: " + c.getArea());

		c.getArea();
	}
}
