package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import employee.EmpDesig;
import employee.Employee;

public class MaxSalary {
	public static void main(String[] argv) {
		
		try (FileReader fr = new FileReader( // Resources ------------------------------
				"/home/dac/rohan/ProvidedMaterial/OOP_java/Core_Java/Core_Java/day10/code/day10.1/day11/src/io/employee.txt");
				BufferedReader br = new BufferedReader(fr);  // Input Buffer
			//	Scanner sc = new Scanner(br) ; 				// 
						) { 
			List<Employee> emp = new ArrayList<>();			
//			String[] tokens = sc.tokens().toArray(String[]::new) ; // Convert to Array of Strings 
// 			String[] tokens = br.lines().toArray(String[]::new) ; // Creates String array with line as element
			br.lines().forEach(l-> {Scanner sc = new Scanner(l) ;
					emp.add(new Employee( sc.nextInt() , sc.next(), sc.nextInt(), EmpDesig.valueOf( sc.next().toUpperCase()) )) ;
					sc.close() ;
			}) ;
			
/*
			for (int i=1 ; i< tokens.length/4 ; i++) {		// Take values from String array to create ArrayList of employee type
				emp.add(new Employee( Integer.parseInt(tokens[0+i*4]) , tokens[1+i*4], Integer.parseInt(tokens[2+i*4])
						, EmpDesig.valueOf( tokens[3+i*4].toUpperCase()) ) ) ;
			}
*/			
			// Get Employee with max salary
			System.out.println(emp.stream().max((l,m)->((Integer)l.getSalary()).compareTo(m.getSalary())) );
			
						
			/* Questions
			 * 1. Extract elements obtained from br.lines() into seperate tokens 
			*/
					
			
			
	
					
 //			br.lines().forEach(l -> System.out.println(l));
		//	System.out.println(sc.nextLine().split("\s",5)[3] );
//			System.out.println(sc.tokens().toArray().length);
//			System.out.println(sc.nextLine().split("\s",5)[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
