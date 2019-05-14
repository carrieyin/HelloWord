package com.ydd.demo.common;

abstract class Shape {
	String name;
	Shape(String name){
		this.name = name;
	}
	public abstract double getArea();
	public abstract double getLength();
}


class CircleDemo extends Shape{

	double r;
	String name;
	public static final double PI = 3.14;
	CircleDemo(String name, double r){
		super(name);
	}
	@Override
	public double getArea() {
		return PI * r * r;
	}

	@Override
	public double getLength() {
		return 2 * PI * r;
	}
	
}