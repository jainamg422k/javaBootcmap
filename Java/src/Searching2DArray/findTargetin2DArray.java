package Searching2DArray;

import java.util.Arrays;
// Array is sorted row wise and column wise 
public class findTargetin2DArray {
	 public static int[] search(int[][]arr , int target) {
		 //if write the binary search  start and end ;
		  int r = 0;
		  int c= arr[0].length-1;
		  
		  //condition till when we need to check the loop
		  while(r<arr.length && c>=0) {
			  if(arr[r][c]== target) {
				  return new int[] {r,c};
			  }
			  else if(arr[r][c]>target){
				 //reduce the cloumn;
				  c--;
			  }
			  else {
				//increase the row pointer  
			   r++;
			  }
		  }
		  return new int[] {-1,-1};
		  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][]arr = {{10,20,30,40},{15,25,35,45},{28,29,37,4},{33,34,38,50}};
     System.out.println(Arrays.toString(search(arr ,37)));
	 
	 }
	}


