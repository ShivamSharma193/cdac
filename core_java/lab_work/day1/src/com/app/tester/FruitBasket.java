package com.app.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruits;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {


/**
 * Menu tester
 * Implement a menu based application
 * Prompt user form the basket size n create suitable data structure
 * 1. Add Mango 2. Add Orange 3. Add apple 4. Display name of all fruits in the basket
 * 5. Display name, color, weight, taste of all fresh fruits, in the basket.
 * 6. Mark a fruit in a basket as stale
 * 7. Mark all sour fruits stale
 * 8. Invoke fruit specific functionality (pulp/juice/jam)
 * 10. exit
 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Please enter the max number of Inputs.");
		System.out.print("size = ");
		int size = scan.nextInt() ;
		
		// Create an array of type fruits
		Fruits[] fruits = new Fruits[size] ;
		boolean exit = false ;// Flag for exiting the menu
		int counter = 0 ;
		while (!exit) {
			System.out.println("1. Add Mango 2. Add Orange 3. Add apple 4. Display name of all fruits in the basket\n"
					+ "5. Display name, color, weight, taste of all fresh fruits, in the basket.\n"
					+ "6. Mark a fruit in a basket as stale 7. Mark all sour fruits stale\n"
					+ "8. Invoke fruit specific functionality (pulp/juice/jam) 10. exit");
			System.out.println() ;
			switch (scan.nextInt()) {	
				case 1 : // Add Mango ---------------------------
					if (counter<size) {
						System.out.println("Enter Following details \n name, color, weight, fresh") ;
						fruits[counter++] = new Mango(scan.next(), scan.next(), scan.nextInt(), scan.nextBoolean()) ;
					}else 
						System.out.println("Basket is full!\n");
					
					break ;
					
				case 2 : // Add Orange --------------------------
					if (counter<size) {
						System.out.println("Enter Following details \n name, color, weight, fresh") ;
						fruits[counter++] = new Orange(scan.next(), scan.next(), scan.nextInt(), scan.nextBoolean()) ;
					}else 	
						System.out.println("Basket is full!\n");
					break ;
				case 3 : // Add Apple ----------------------------
					if (counter < size) {
					System.out.println("Enter Following details \n name, color, weight, fresh") ;
					fruits[counter++] = new Apple(scan.next(), scan.next(), scan.nextInt(), scan.nextBoolean());				
					}else 
						System.out.println("Basket is full!\n");
					break ;
				case 4 : // Display name of all fruits in the basket ------------
					System.out.println("Displaying name of all fruits...");
					for (Fruits fruit : fruits ) { 	// Limit to elements which have objects
						if (fruit!=null)
							System.out.print(fruit.getName()+" \t");
					}
					System.out.println("\n");
					break ;
				case 5 :  // Display name, color, weight, taste of all fresh fruits
					System.out.println("Displaying Name, color, weigth and taste of fruits.");
					for (Fruits fruit : fruits) {
						if (fruit!=null) { // Limit to elements which have objects
							if (fruit.isFresh()){
								System.out.println( fruit.getName()+
										" is "+ fruit.getColor()+" in color and has "
										+ fruit.getWeight()+" units of weight. Its taste is "+ fruit.taste()) ;
							}
						}
					}
					System.out.println("\n");
					break ;
				case 6 : // Mark a fruit in a basket as stale
					System.out.println("Which fruit do you want to make stale - Enter the number \n 1. Apple \n 2. Mango \n 3. Orange ") ;
					
					switch (scan.nextInt()) {
						case 1 :		 
							for (Fruits fruit : fruits) {
								if (fruit != null) { // Limit to elements which have objects
									if (fruit instanceof Apple) {
											if (fruit.isFresh()) {
												fruit.setFresh(false);
												System.out.println("Made "+fruit.getName()+ " stale.");
											}else {System.out.println(fruit.getName() + " is already stale.");}
								
									}
								} 
					
							} // End Array wise check 
							break ;
						case 2 :		 
							for (Fruits fruit : fruits) {
								if (fruit != null) {
									if (fruit instanceof Mango) {
										if (fruit.isFresh()) {
											fruit.setFresh(false);
											System.out.println("Made "+fruit.getName()+ " stale.");									
											}else {System.out.println(fruit.getName() + " is already stale.");}
								
									}
								} // 
							} // End Array wise check  
							break ;
						case 3 :		 
							for (Fruits fruit : fruits) {
								if (fruit != null) {
									if (fruit instanceof Orange) {
										if (fruit.isFresh()) {
											fruit.setFresh(false);
											System.out.println("Made "+fruit.getName()+ " stale.");									
										}else {System.out.println(fruit.getName() + " is already stale.");}
								
									}
								} // 
							} // End Array wise check 
							break ;
								
					} // End switch 
					break ;
					

				case 7 : // Mark all sour fruits stale 
					for (Fruits fruit : fruits) {
						if ((fruit.taste()).contains("sour")) {
							fruit.setFresh(false);
						}
					}
					System.out.println("Made all sour fruit stale.");
					break ;
				case 8 : // Invoke fruit specific functionality (pulp/juice/jam)
					for (Fruits fruit: fruits) {
						if (fruit instanceof Mango) {
							((Mango) fruit).pulp();
						}else if(fruit instanceof Orange){
							((Orange)fruit).juice();
						}else {
							((Apple)fruit).jam();
						}
					}
					break ;
				case 10 : // exit 
					exit = true ;
					System.out.println("Exiting the Application.\nSayonara");
					break ;
					
	
			}
		} // while loop end
		scan.close() ;
	} // Main method end

}

