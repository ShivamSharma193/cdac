package com.app.fruits;


public class Mango extends Fruits {
	public Mango(String name, String color, int weight, boolean fresh)  
	{
		super(name, color, weight, fresh) ; //Calls constructor of immediate super class
	}
	
	@Override	
	public String taste() { // Present in Superclass
		return "sweet";
	}
	
	public void pulp() { 		// Not present in Superclass
		System.out.println("Making pulp of "+ getName());
	}
}