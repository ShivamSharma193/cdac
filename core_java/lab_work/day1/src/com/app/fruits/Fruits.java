package com.app.fruits;

public abstract class Fruits {
	// Instance variables
	private double weight;
	private boolean fresh;
	private String color;
	private String name;

	// Constructor
	public Fruits(String name, String color, int weight, boolean fresh) {
		this.weight = weight;
		this.color = color;
		this.fresh = fresh;
		this.name = name;
	}

	public boolean isFresh() {
		return this.fresh;
	}

	public abstract String taste(); // Subclass specific property

	@Override
	public String toString() // Override toString
	{
		return this.name + " " + this.color + this.weight + " " + this.fresh;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}