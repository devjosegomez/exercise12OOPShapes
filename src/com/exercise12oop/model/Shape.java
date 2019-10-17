package com.exercise12oop.model;

public class Shape implements Shapeable {

	@Override
	public String Draw() {
		// TODO Auto-generated method stub
		return "Figure is being drawn";
	}

	@Override
	public String ChangeColor() {
		// TODO Auto-generated method stub
		return "Figure color has been changed";
	}

	@Override
	public String Erase() {
		// TODO Auto-generated method stub
		return "Figure is being erased";
	}

	@Override
	public void CalculateArea(double b, double h) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CalculatePerimeter() {
		// TODO Auto-generated method stub
		
	}

	
}
