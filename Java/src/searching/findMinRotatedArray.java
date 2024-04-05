package searching;

public class findMinRotatedArray {

	public static void main(String[] args) {
        int nums [] = { 0,1,2,3,4};
        if(nums[0]<nums[nums.length-1]) {
        	System.out.println(nums[0]);
        }
        else {
        	
        	System.out.println(findMin(nums));
        }
	}
	public static int findMin(int[] nums) {

	    
      	 int start = 0;
   	 int end = nums.length-1;
   	 //int pivot = -1;
   	 
   	while (start <= end) {
   		int  mid = (start+end)/2;
   	    if (mid<end && nums[mid]>nums[mid+1]) {
   	    
   	    	return nums[mid+1]; 
   	    }
   	    else if (nums[mid]<nums[mid-1]) {
   	    	 return  nums[mid-1+1];
   	    }
   	    else if(nums[start]>=nums[mid]) {
   	         	end = mid;
   	    }
   	    else {
   	    	 start = mid+1;
   	    }
   	    
   	}
   	return -1;
    } 
   }


