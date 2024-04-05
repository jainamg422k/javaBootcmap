package sortingViaRecurrsion;

import java.util.Arrays;

public class SelectionSortRecurrsion {

	public static void main(String[] args) {
		 int[]arr = {4,5,1,2,3};
		 selectionSort(arr);
		 System.out.println(Arrays.toString(arr));

	}
	public static void selectionSort(int []arr) {
		
		int pass =  arr.length ;
		int c = 0;
		int max =0;
		helper(arr,pass, c, max);
	}
	public static void helper(int[]arr, int pass , int c , int max) {
		// base condition
				if(pass == 0) {
					return;
				}
				
				//1st working 
				if(c<pass) {
					if(arr[c] > arr[max]) {
						helper(arr , pass , c+1 , c);
					}else {
						 helper(arr , pass , c+1 , max);
					}	      
				} 
				else {
					int temp = arr[max];
					 arr[max] = arr[pass-1];
					 arr[pass-1] =temp;
					
					helper(arr , pass-1 , 0 , 0);
				}
	}
	
}
