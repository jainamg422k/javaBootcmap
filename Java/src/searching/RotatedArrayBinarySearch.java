package searching;

public class RotatedArrayBinarySearch {

	public static void main(String[] args) {
		
      int[]nums = {3,4,5,6,7,0,1,2};
      int target =5;
      int position = search(nums, target);
      System.out.println(position);
	}
	public static int search(int []arr , int target) {
		int pivot = findPivot(arr);
		int s = 0;
		int e = arr.length-1;
		//if pivot not found do normal binary search 
		if (pivot== -1) {
			int searchposition = binarySearch(arr ,  target , s , e);
		     return searchposition;
	}
		 if (target >= arr[s]){
			return binarySearch(arr, target , s, pivot-1);
		}
		
		return  binarySearch(arr,target ,pivot+1 , e);
		 
			
		
		
		
}

	public static int findPivot(int []arr) {
		int s = 0;
		int e= arr.length-1;
		while (s<=e) {
			int mid =(s+e)/2;
		    if(mid<e && arr[mid]>arr[mid+1]) {
		    	return mid ;
		    }
		    else if (arr[mid]<arr[mid -1]) {
		    	return mid -1;
		    }
		    else if (arr[s]>=arr[mid]) {
		    	e = mid;
		    }
		    else {
		    	s = mid+1;
		    }
		 
		}
		return -1;
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
