package sort;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		for (int cursor=1 ; cursor<arr.length ;cursor++) {
			if(arr[cursor-1]>arr[cursor]) { 
				int i = cursor ;
				boolean posFound = false ;
				while(!posFound) {
					if(i==0 || (arr[i-1]<arr[i]) ) { // left neighbor is smaller
						posFound = true ;
					}else { // Swap
						int temp = arr[i-1];
						arr[i-1] =arr[i] ;
						arr[i] = temp;
					} 
					i--;
				}

			}
		}
	
	}
}
