package sort;

import java.util.Arrays;

public class QuickSort {
	
	
	private static int lomutoPartition(int[] arr, int left, int right) {
		int pivot =right;
		int slowIndex = left;
		int fastIndex = left ;
		
		while(fastIndex <= pivot) {
			// If the value at fastIndex is smaller than or equal to the pivot
			// Move it to the position next to slowIndex
			if (arr[fastIndex] <= arr[pivot]) {
				// swap the smaller element
				int temp = arr[fastIndex] ;
				arr[fastIndex] = arr[slowIndex];
				arr[slowIndex] = temp ;
				slowIndex++ ; // increase slowIndex
			}
			fastIndex++ ;
		}
		pivot = slowIndex-1 ;
		return pivot;
	}
	
	public static void quickSort(int[] arr){
		lomutoQuickSort(arr, 0, arr.length-1);
	}
	
	private static void lomutoQuickSort(int[] arr, int left, int right ) {
		if(left >= right)
			return ;
		int pivot  = lomutoPartition(arr,left,right);
		lomutoQuickSort(arr,left,pivot-1) ;
		lomutoQuickSort(arr, pivot+1, right);
	}
}
