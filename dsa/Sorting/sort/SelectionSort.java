package sort;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int smallest = 0 ;
		for(int cursor=0 ; cursor<arr.length ;cursor++) {
			smallest = cursor ;
			for(int i=cursor; i<arr.length ;i++) {
				if(arr[i]<arr[smallest]) {
					smallest = i;
				}
			}
			// swap cursor element with the smallest element 
			int temp = arr[smallest] ;
			arr[smallest] = arr[cursor];
			arr[cursor] = temp ;
		}
	}
}
