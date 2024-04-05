package searching;

public class InfiniteArrayGetPosition {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
		int target  = 8;
		System.out.println(ans(arr, target));
        
	}
	public static int ans (int [] nums , int target) {
		int  start = 0;
		int end = 1;
		while(target > nums[end]) {
			int newstart = end +1;
			 end = end +(end-start+1)*2;
			 start = newstart;
					 
		}
		return binarySearch(nums , target , start , end);
	}
	public static int  binarySearch(int[] arr ,  int val , int start , int end){
    	
    	int position =-1;
    	if (arr[0]<= arr[1]) {
    		
    
            position =-1;
    	   while (start<= end) {
    		  int mid = (start+end)/2;
    		 if(arr[mid]== val) {
    			position =mid;
    			return position;
    		 }
    		 else if (arr[mid]>val) {
    			 end =mid-1;
    		 }
    		 else {
    			start= mid+1;  
    		 }
    	   }
     }
    
    
    	return position;
    }
    
 }


