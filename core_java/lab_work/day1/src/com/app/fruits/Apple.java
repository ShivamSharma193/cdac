package com.app.fruits;


public class Apple extends Fruits {
	
	public Apple(String name, String color, int weight, boolean fresh) 
	{
		super(name, color, weight, fresh) ; 	//Calls constructor of immediate super class
	}
	
	@Override
	public String taste() { 		
		return "sweet n sour";
	}

	
	public void jam() { 		
		System.out.println("Making Jam of " + getName());
	}
}