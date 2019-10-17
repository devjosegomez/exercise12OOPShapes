package com.exercise12oop.model;
import java.lang.Math;
public class Circle extends Shape{
	private double radio;
	
	public Circle() {
		
	}
	
	public Circle(double radio) {
		this.radio = radio;

	}
	
	
	public double getRadio(double radio) {
		return radio;

	}
	
	public void setRadio(double radio) {
		this.radio =  radio;

	}
	
	//methods
	
	public double CalculateArea(double radio) {
		return Math.PI*(Math.pow(radio, 2));
	}
	
	public double CalculatePerimeter(double base, double height, double hypotenuse) {
		return 2*Math.PI*radio;
	}
	
}
