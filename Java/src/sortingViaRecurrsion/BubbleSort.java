package sortingViaRecurrsion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
      int [] arr = {5,3,2,4};
      bubbleSort(arr);
      System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(int []arr ) {
		 int pass = arr.length;
		 int col = 0;
		 helper(arr , pass , col);
	
	}
	
	public static void helper(int []arr , int pass , int col) {
		 //break condition
			if(pass == 0) {
				return;
			}
			// comparing  everyelement in each pass
			if(col<pass-1) {
				//check if current element is greater than next  element if yes then swipe
				if(arr[col]>arr[col+1]) {
					swap(arr , col , col+1);
				// now check for next cols  in same pass 
				}
					helper(arr, pass, col+1);
			}
				
				else {
					//  first pass largest element is sent in end and check for second last element  check from starting 
					helper(arr, pass-1, 0);
				}
			}
	
	private static void swap(int[] arr, int s , int e) {
           int temp  = arr[s];
           arr[s] =arr[e];
           arr[e] =temp;
	}

}
