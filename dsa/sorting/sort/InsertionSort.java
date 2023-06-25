package sort;

import tester.Tester;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		for (int cursor=1 ; cursor<arr.length ;cursor++) {
			if(arr[cursor-1]>arr[cursor]) { // cursor element is not largest 
				// Find correct position of the cursor
				int i  ;
				int cursorVal = arr[cursor] ;
				
				for (i=cursor; i>0 && (arr[i-1]>cursorVal); i--  ) {
					arr[i] = arr[i-1] ;
				}
				arr[i] = cursorVal ;
			}
		}
	
	}
}
