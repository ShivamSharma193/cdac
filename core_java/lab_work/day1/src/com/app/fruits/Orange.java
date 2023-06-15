package com.app.fruits;

public class Orange extends Fruits {
	
	public Orange(String name, String color, int weight, boolean fresh) 
	{
		super(name, color, weight, fresh) ; //Calls constructor of immediate super class
	}
	
	@Override
	public String taste() {			// Present in Fruits class
		return "sour";
	}
	
	public void juice() {			// Not present in Fruits class
		System.out.println(getName()+ " "+ getColor()+ " " + "Making juice!");
	}

}