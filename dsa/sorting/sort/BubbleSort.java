package sort;

public class BubbleSort {

	public static void bubbleSort(int[] arr) { // Without considering if the array is already sorted
		int l = arr.length;
		for (int i = 0; i<l; i++) {
			for (int j = 0; j<l-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void bubbleSortAdaptive(int[] arr) { // adaptive algorithm				
		int l = arr.length;
		boolean swapped = true;
		int i = 0;
		while (swapped && i<l) { // Stop if array is sorted or Complete iterations are done
			swapped = false ;
			for (int j = 0; j<l-i-1; j++) { // Check consecutive elements 
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
					swapped = true  ; // Array is unsorted
				}
			}
			i++ ; 
		}
	}
}
