package tester;

import sort.BubbleSort;
import sort.InsertionSort;

public class Tester {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 34, 5, 34, 2, 21, 43,1,2 };
		printArray(arr);
//		BubbleSort.bubbleSortOptimized(arr);
		InsertionSort.insertionSort(arr);
		printArray(arr);
	}

}
