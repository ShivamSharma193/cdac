package com.shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		System.out.println("\narray list ");
		List<Integer> arrListInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		System.out.println("List ::" + arrListInt);
		Collections.reverse(arrListInt);
		System.out.println("reverse List ::" + arrListInt);
		Collections.shuffle(arrListInt);
		System.out.println("shuffled list ::" + arrListInt);

		System.out.println("\nlinked list ");
		List<Double> arrDouble = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
		LinkedList<Double> llDouble = new LinkedList(arrDouble);
		System.out.println("linked list ::" + llDouble);
		Collections.reverse(llDouble);
		System.out.println("reverse linked list ::" + llDouble);
		Collections.shuffle(llDouble);
		System.out.println("shuffled linked list ::" + llDouble);

		System.out.println("\nvector");
		List<String> arrString = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten");
		Vector<String> vectString = new Vector(arrString);
		System.out.println("vector ::" + vectString);
		Collections.reverse(vectString);
		System.out.println("reverse vector ::" + vectString);
		Collections.shuffle(vectString);
		System.out.println("shuffled vector ::" + vectString);

	}

}