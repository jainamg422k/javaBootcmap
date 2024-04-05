package searching;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
        int []nums = {5,6,7,7,7,8,10};
        int target =6;
         int[] arr = numsPos(nums , target);
         System.out.println(Arrays.toString(arr));
	}
	public static int[]numsPos(int []nums , int target){
		int [] ans = {-1 , -1};
	int start =  binarySearch(nums , target , true);
	int end =  binarySearch(nums , target , false);
	
	ans[0] = start;
	ans[1] = end;
   return ans;
	}
	 public static int binarySearch(int[]nums , int target , boolean firstIndex) {
		 int a = -1;
		 int start = 0;
		 int end = nums.length-1;
		 
		 while(start <=end) {
			 int mid = (start+end)/2;
             if(target<nums[mid]) {
            	 end = mid-1;
             }
             else if(target> nums[mid]) {
            	 start = mid+1;
             }
             else {
            	 a = mid;
            	 if(firstIndex == true) {
            		 end = mid-1;
            	 }
            	 else {
            		 start = mid+1;
            	 }
             }
             
		 }
	 
		 return a; 
	 } 

}
