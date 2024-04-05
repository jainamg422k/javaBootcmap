package sortingAlgo;

import java.util.Arrays;

public class insertionSort {
   public static void insertionSorting(int[]arr) {
	    for(int i =0 ; i <= arr.length-2; i++ ) {
	    	for(int j = i+1 ; j>0 ; j--) {
	    		 if(arr[j]<arr[j-1]) {
	    			 swap(arr , j , j-1);
	    		 }
	    		 else {
	    			 break;
	    		 }
	    	}
	    }
   }
   static void swap(int[]arr , int first , int end ){
	   int temp = arr[first];
		  arr[first] = arr[end];
		  arr[end]= temp;
		
	}
   
	public static void main(String[] args) {
		 int [] arr = {5,3,4,1,2};
		 insertionSorting(arr);
		 System.out.println(Arrays.toString(arr));

	}

}
