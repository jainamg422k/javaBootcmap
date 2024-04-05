package sortingAlgo;

import java.util.*;

class AllDisapperedNumberINArray {
	  public static void cyclicSort(int []arr) {
	    	 int i = 0 ;
	    	 while(i<arr.length) {
	    		 int c = arr[i]-1;
	    	
	    		 if(arr[i] != arr[c]) {
	    			  
	    			  swap( arr , i ,c);
	    			 
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
    public static  List<Integer> findDisappearedNumbers(int[]nums) {
         cyclicSort(nums);
     List <Integer> arr = new ArrayList<>();
     for(int i =0 ; i < nums.length; i++) {
    	 if(i+1 != nums[i]) {
    	 arr.add(i+1);
     }
    }
     return arr;
    }
     public static  void main(String []args) {
    	 int [] nums = {4,3,2,7,8,2,3,1};
    	 List<Integer>arr  =  findDisappearedNumbers(nums);
    	 System.out.println(arr);
     }
    	 
}