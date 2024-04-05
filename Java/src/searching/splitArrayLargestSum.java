package searching;

public class splitArrayLargestSum {
	 public static  int splitArray(int[] nums, int k) {
		 int start =0;
		 int end =0;
	        for(int i =0; i<nums.length;i++) {
	        	start = Math.max(start, nums[i]);
	        	end+= nums[i];
	        }
	        
	        //binary search 
	        while(start<end) {
	        //try  for the middle  potential ans;
	         int mid  = (start+end)/2;
	         // calculate how many pieces you can divide this in with this max sum
	         
	         int sum =0;
	         int pieces =1;
	         for(int i:nums) {
	        	 if(sum+i>mid) {
	        		 //you cannot add this in this subaaray , make new one;
	        		 //say you  add this num in new array  , then sum = num;
	        		 
	        		 sum = i;
	        		 pieces++;
	        	 }
	        	 else {
	        		 sum+=i;
	        	 }
	         }
	        	 
	        	 if(pieces> k) {
	        		 start = mid +1;
	        	 }
	        	 else {
	        		 end = mid;
	        	 }
	        	 
	        	 
	         
	         
	        	//
	        }
	        return start; //here start ==end; 
	        
	        
	        
	    }
	public static void main(String[] args) {
       int []nums = {7,2,5,10,8};
       System.out.println("sum is"+" "+splitArray(nums, 2));
	}

}
