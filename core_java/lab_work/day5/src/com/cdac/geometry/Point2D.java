package com.cdac.geometry;

import static java.lang.Math.sqrt ;
public class Point2D {
	// Instance Variables for x and y coordinates
	private double x ;
	private double y ;
	
	public Point2D(double x, double y) { // Parameterized Constructor
		this.x = x;
		this.y = y ;			
	}
	
	// Override toString to return point's x and y coordinates.
	@Override
	public String toString() {
		return "Point2D ("+ this.x+", "+ this.y +" )" ; 
	}
	
	// Check if two points are equal using new custom method 
	public boolean isEqual(Point2D anotherPoint) {
		return   this.x == anotherPoint.x && this.y ==anotherPoint.y ;
	} 
	
	// Check if two points are equal by overriding equal() method
	@Override
	public boolean equals(Object obj) {
		
		return this.x == ((Point2D)obj).getX() && this.y == ((Point2D)obj).getY() ;
	}
	
	// Calculate distance between two points 
	public static double calculateDistance(Point2D pt1, Point2D pt2) {
		return sqrt( (pt1.x-pt2.x)*(pt1.x-pt2.x)+ 
				(pt1.y-pt2.y)*(pt1.y-pt2.y) ) ;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
}
