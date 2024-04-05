package sortingAlgo;

import java.util.Arrays;

public class CylicSort {
    public static void cyclicSort(int []arr) {
    	 int i = 0 ;
    	 while(i<arr.length) {
    		 if(i != arr[i]-1) {
    			  swap( arr , i , arr[i]-1);
    		 }
    		 else {
    			 i++;
    		 }
    	 }
    }
    static void swap(int[]arr , int first , int end ){
 	   int temp = arr[first];
 		  arr[first] = arr[end];
 		  arr[end]= temp;
 		
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {5,3,4,1,2};
		 cyclicSort(arr);
		 System.out.println(Arrays.toString(arr));

	}

}
