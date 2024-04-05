package sortingAlgo;

import java.util.Arrays;

public class selectionSort {
    public static void selection(int []arr) {
    	for(int pass=0 ;  pass < arr.length ; pass++) {
          int lastIndex =  arr.length-pass-1;
          int max = getMax(arr , 0 ,lastIndex);
          swap(arr , max , lastIndex);
          
    }
   }
	 static void swap(int[] arr, int first ,int end) {
		  int temp = arr[first];
		  arr[first] = arr[end];
		  arr[end]= temp;
		
	}
	 static int getMax(int[] arr, int start, int end) {
		int max = start;
		 for(int i =0 ; i<=end ;i++) {
			 if(arr[i]>arr[max]) {
				  max =i;
			 }
		
		 }
		 return max;
	}
	public static void main(String[] args) {
		 int [] arr = { 5,3,1,5,4,0,2};
		 selection(arr);
		 System.out.println(Arrays.toString(arr));

	}

}
