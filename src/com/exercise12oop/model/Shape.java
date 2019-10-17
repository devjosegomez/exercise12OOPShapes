package com.exercise12oop.model;

public class Shape implements Shapeable {

	@Override
	public String Draw() {
		return "Figure is being drawn";
	}

	@Override
	public String ChangeColor() {
		return "Figure color has been changed";
	}

	@Override
	public String Erase() {
		return "Figure is being erased";
	}

	@Override
	public double CalculateArea() {
		return 0;
	}

	@Override
	public double CalculatePerimeter() {
		return 0;
	}

	
}
