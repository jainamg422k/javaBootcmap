package sortingAlgo;

import java.util.ArrayList;
import java.util.List;

public class MissingPositive {

	public static  int missingNumber(int[] nums){
		int i =0;
		while(i< nums.length) {
			int correct = nums[i]-1;
			if(nums[i]>0 && nums[i]<= nums.length &&nums[i] != nums[correct]) {
			   swap( nums , i , correct);	
			}
			else {
				i++;
			}
		}
	
	
   List<Integer>  arr = new ArrayList<Integer>();
   for(int j  = 0 ; j< nums.length ; j++) {
	   if(nums[j]!= j+1) {
	    return j+1;
	   }
   }
   return -1;
}

   
	 public static void swap(int[] nums, int first , int end) {
		 int temp  = nums[first];
		 nums[first] = nums[end];
		 nums[end] = temp;
	 }
    public static void main(String[]args) {
    	int [] arr = {4,3,2,7,8,2,3,1};
    	System.out.println(missingNumber(arr));
    }             
	
}
