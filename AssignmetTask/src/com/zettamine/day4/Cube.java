package com.zettamine.day4;

public class Cube extends Shape implements Spatial {

	
	private double length;
	private double width;
	private double height;
 
	public Cube(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
	
		return ((2 * this.length * this.width) + (2 * this.length * this.height) + (2* this.width * this.height));
	}

	@Override
	public double volume() {
		
		return (this.length * this.width * this.height);
	}

}
