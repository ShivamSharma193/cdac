package tester;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.SelectionSort;

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
//		BubbleSort.bubbleSort(arr);
//		BubbleSort.bubbleSortAdaptive(arr);
//		InsertionSort.insertionSort(arr);
		SelectionSort.selectionSort(arr);
		printArray(arr);
	}

}
