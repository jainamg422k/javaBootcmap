package searching;

public class TotalNoTimeArrayRotated {
     public  static int RotationCountArray(int []arr) {
    	 int start = 0;
    	 int end = arr.length-1;
    	 //int pivot = -1;
    	 
    	while (start <= end) {
    		int  mid = (start+end)/2;
    	    if (mid<end && arr[mid]>arr[mid+1]) {
    	    
    	    	return mid; 
    	    }
    	    else if (arr[mid]<arr[mid-1]) {
    	    	 return  mid-1;
    	    }
    	    else if(arr[start]>=arr[mid]) {
    	         	end = mid;
    	    }
    	    else {
    	    	 start = mid+1;
    	    }
    	    
    	}
    	return -1;
     }
	public static void main(String[] args) {
		 int[]arr = { 3,4,5,6,7,0,1,2};
		  int s = RotationCountArray(arr);
		  System.out.println(s+1);

	}

}
