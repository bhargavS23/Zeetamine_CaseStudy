package com.zettamine.day4;

import java.util.Scanner;

public class MeasureShapes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Shape[] shape = new Shape[5];
		
		System.out.print("Enter base of triangle: ");
		double base = scn.nextDouble();
		System.out.print("Enter height of triangle: ");
		double height = scn.nextDouble();
		shape[0] = new Triangle(base, height);
		
		System.out.print("Enter the radius of sphere: ");
		double radius = scn.nextDouble();
		shape[1] = new Sphere(radius);
		
		System.out.print("Enter length of rectangle: ");
		double length = scn.nextDouble();
		System.out.print("Enter width of rectangle: ");
		double width = scn.nextDouble();
		shape[2] = new Rectangle(length, width);
		
		System.out.print("Enter length of cube: ");
		double cubLength = scn.nextDouble();
		System.out.print("Enter width of cube: ");
		double cubWidth = scn.nextDouble();
		System.out.print("Enter height of cube: ");
		double cubHeight = scn.nextDouble();
		shape[3] = new Cube(cubLength, cubWidth, cubHeight);
		
		System.out.print("Enter base of triangle: ");
		 base = scn.nextDouble();
		System.out.print("Enter height of triangle: ");
		 height = scn.nextDouble();
		shape[4] = new Triangle(base, height);
		
		for (int i = 0; i < shape.length; i++) {
			System.out.printf("Area : %.2f \n" ,shape[i].area());
			if(shape[i] instanceof Spatial) {
				System.out.printf("Volume : %.2f \n",shape[i].volume());
			}
		}	
	}
}
