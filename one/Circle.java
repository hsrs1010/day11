package com.one;

public class Circle {
	int radius;
	String name;

	public Circle() {
		radius = 1;
		name = "";
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		Circle pizza = new Circle();
		double area = pizza.getArea();
		System.out.println("¸éÀû : " +area);
	}

}
