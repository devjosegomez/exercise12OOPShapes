package com.exercise12oop.model;

public class Square extends Shape {
	private double side;
	
	public Square() {
		
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	//getters and setters
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	
	//methods
	public double CalculateArea(double side) {
		return side*side;
	}
	
	public double CalculatePerimeter(double side) {
		return side*4;
	}
	
}
