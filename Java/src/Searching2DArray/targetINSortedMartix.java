package Searching2DArray;

import java.util.Arrays;

// Array is fully sorted

public class targetINSortedMartix {
	public static void main(String[] args) {
	    int[][]arr = {{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160,170}};
	    System.out.println(Arrays.toString(search(arr ,110)));
	}
    public static int[] binarySearch(int[][]matrix , int row , int cStart ,int cEnd,int target) {
    	while(cStart <= cEnd) {
    		int mid = (cStart+cEnd)/2;
    		if(matrix[row][mid]> target) {
    			cEnd = mid-1;
    		}
    		else if(matrix[row][mid]<target) {
    			cStart = mid+1;
    		}
    		else {
    			return  new int[] {row, mid};
    		}
    	}
    	return new int[] { -1, -1};
    }
	public static int[]search (int[][]arr , int target){
	    int rows = arr.length;
	    int cols = arr[0].length;
	    if(rows == 1) {
	    	return binarySearch(arr, 0, 0, cols-1, target);
	    }
	    
	    int rStart = 0;
	    int rEnd = rows-1;
	    int cMid = cols/2;
	    // run the loop till 2 rows are remaining 
	    while(rStart<(rEnd-1)) {//while this is true it will have more than 2 rows
	    	
	     int mid = (rStart + rEnd)/2;
	     if(arr[mid][cMid] == target) {
	    	 return new int[] {mid , cMid};
	     }
	     if(arr[mid][cMid]< target) {
	    	 rStart = mid;
	     }
	     else {
	    	 rEnd = mid;
	     }
	    }
	    
	    //now we have rows
	    //check whether the target  is in the col of 2 rows
	    
	    if(arr[rStart][cMid]== target) {
	    	return new int[] {rStart , cMid};
	    }
	    if(arr [rStart+1][cMid]== target) {
	    	return new int[] {rStart +1 , cMid};
	    }
	    
	    //search in 1st  half 
	     if (target <= arr[rStart][cMid-1]) {
	    	 return binarySearch(arr, rStart, 0, cMid-1, target); 
	     }
	  //search in 2nd  half
	     if (target >= arr[rStart][cMid+1]&& target<= arr[rStart][cols-1]) {
	    	 return binarySearch(arr, rStart,cMid+1, cols-1 ,target) ;
	     }
	  //search in 3rd  half 
	     if (target <= arr[rStart+1][cMid-1] ) {
	    	 return binarySearch(arr, rStart+1, 0, cMid-1, target) ;  
	     }
	  //search in 4th  half 
	     else {
	    	 return binarySearch(arr, rStart+1,cMid+1, cols-1 ,target) ;
	     }
	}
	

}
