package com.exercise12oop.model;
import java.lang.Math;

public class Triangle extends Shape{

	private double base;
	private double height;
	public double area;
	private double perimeter;
	protected String name;
	
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
	
	//methods
	public double CalculateArea(double base, double height) {
		return (base*height)/2;
	}
	
	public double CalculatePerimeter(double base, double height, double hypotenuse) {
		return Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
	}
	
	public double CalculatePerimeter() {
		this.perimeter = Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.height, 2));
		this.name = "Default";
		return 0;
	}
}
