package com.example.demo;

public class Triangle implements Shape{
	private Point p1,p2,p3;

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}
	
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	
	
	@Override
	public String toString() {
		return "Triangle [p1=" + p1.getX() + ", p2=" + p2.getX() + ", p3=" + p3.getX() + "]";
	}
	
	public void draw() {
		System.out.println(this.toString());
	}
}
