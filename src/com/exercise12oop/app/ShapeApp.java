package com.exercise12oop.app;
import java.util.Scanner;

import com.exercise12oop.model.Circle;
import com.exercise12oop.model.Square;
import com.exercise12oop.model.Triangle;

public class ShapeApp {

	public static void main(String[] args) {
		double radio = 0;
		
		Square square1 = new Square();
		Circle circle1 = new Circle();
		Triangle triangle1 = new Triangle();
		triangle1.area = 111.0;
		
		Square square2 = new Square(11.8);
		Circle circle2 = new Circle(5.4);
		Triangle triangle2 = new Triangle(5.4, 6.8);
		
		square1.setSide(10.2);
		System.out.println("Side of square1: " + square1.getSide());
		
		System.out.println("Side of square2: " + square2.getSide());
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radio of the circle: ");
		radio = input.nextDouble();
		
		circle1.setRadio(radio);
		
		System.out.println(circle1.CalculateArea(circle1.getRadio()));
	}

}
