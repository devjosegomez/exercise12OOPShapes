package com.exercise12oop.model;

public class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle() {
		
	}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	//getters and setters Base
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	
	//getters and setters Height
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
}
