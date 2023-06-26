package sort;

import tester.Tester;

public class MergeSort {
	public static void mergeSort(int[] arr, int left, int right ) {
		// Uncomment the print statement to understand the function calls 

//		System.out.println("->" + left + " "+ right);

		// Base condition => left >= right
		if(left>=right) {
			return ;
		}
		
		// Partition the array into two halves and call merge sort on them
		int mid = (left+right)/2 ;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		
		
		// Merge the two parts
		// copy until one partition is done
		int[] temp = new int[right-left+1] ;
		int i = left, j = mid+1 , k = 0 ;
		
		while(i<=mid && j<=right) {
			if(arr[i]<arr[j]) {
				temp[k++] = arr[i++] ;
			}else {
				temp[k++] = arr[j++] ;
			}		

		}
		// copy the remaining partitions
		while(i<=mid) {
			temp[k++] = arr[i++] ;
		}
		
		while(j<=right) {
			temp[k++] = arr[j++] ; 
		}
		
		// Copy the changes from temp to the array
		for(int w=0 ; w<temp.length; w++) {
			arr[left+w] = temp[w] ;
		}
	}
}
