package com.example.demo;

public class Circle implements Shape{
	Point center;
	@Override
	public void draw() {
		System.out.println(this.toString());
		
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}
	
}
