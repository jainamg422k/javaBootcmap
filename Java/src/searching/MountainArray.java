package searching;

public class MountainArray {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9,10,3,2,1};
		int target = 5;
		System.out.println(search(arr , target));

	}
	
    static int search(int[]arr , int target) {
    	//Fist the peak element in the array
    	int peak = peak(arr);
    	//Second do binary search from start till peak element 
    	int firsttry = binarySearch(arr, target, 0 /*start*/, peak);
    	
    	// if  it is not -1 then return position else 
        if (firsttry != -1) {
        	return firsttry;
        }
        //check from peak to arr.length -1 and return position
      int   secondtry = binarySearch(arr, target, peak , arr.length-1);
       return  secondtry;
    }
	public static int  peak(int []arr) {
		int start = 0;
		int end = arr.length-1;
		while (start < end) {
			int mid = (start+end)/2;
			if(arr[mid]>arr[mid+1]) {
				end  = mid;
			}
			else {
				start = mid+1;
			}
		}
		return start;
	}
	public static int  binarySearch(int[] arr ,  int val , int s , int e){
    	
    	int position =-1;
    	if (arr[0]<= arr[1]) {
    		
    
            position =-1;
    	   while (s<= e) {
    		  int mid = (s+e)/2;
    		 if(arr[mid]== val) {
    			position =mid;
    			return position;
    		 }
    		 else if (arr[mid]>val) {
    			 e =mid-1;
    		 }
    		 else {
    			s= mid+1;  
    		 }
    	   }
    	   ;
     }
    
    else {
    	while (s<= e) {
  		  int mid = (s+e)/2;
  		 if(arr[mid]== val) {
  			position =mid;
  			return position;
  		 }
  		 else if (arr[mid]>val) {
  			s  =mid-1;
  		 }
  		 else {
  			e= mid+1;  
  		 }
  	   }
    }
  	   return position;
    
 }

}
