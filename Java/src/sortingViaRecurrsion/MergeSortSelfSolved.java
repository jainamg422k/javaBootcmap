package sortingViaRecurrsion;

import java.util.Arrays;

public class MergeSortSelfSolved {

	public static void main(String[] args) {
		int [] arr = {8,3,4,12,5,6};
	int[]newarray =	mergeSort(arr);
		System.out.println(Arrays.toString(newarray));

	}
	 public static   int[] mergeSort( int []arr) {
		 //divide array into two half
		 int mid = (arr.length-1)/2;
		 int []arr1  = new int[mid+1];
		 int []arr2 = new int[arr.length-mid-1];
		 int j =0;
		 for(int i=0 ; i<arr.length ;i++) {
			 if(i<=mid) {
				 arr1[i] = arr[i];
				}
			 else {
				
				 arr2[j] =arr[i];
				 j++;
			 }
		 }
		 System.out.println(mid);
		 System.out.println(arr.length);
		arr1= sort(arr1 ,0 , mid );
		arr2=  sort(arr2 , mid+1 , arr.length-1);
		 
		 int[] finalArray = new int[arr1.length+arr2.length];
		 
		 int i = 0;
		 int pointer1 =0;
		 int pointer2=0;
		 int n1 = arr1.length;
		 int n2 = arr2.length;
		 System.out.println(Arrays.toString(arr1));
		 System.out.println(Arrays.toString(arr2));
		 while(pointer1<n1 &&pointer2<n2) {
		 if(arr1[pointer1] <arr2[pointer2]) {
			 finalArray[i] = arr1[pointer1];
			 pointer1++;
		 }
		 else {
			 finalArray[i] = arr2[pointer2];
			 pointer2++;
			}
		 i++;
	  }
		 return finalArray;
	 }	
	 
	 
	private static int[] sort(int[] arr, int i, int mid) {
		int []newArrays = new int[mid+1];
		
		for(int j = 0 ; j<newArrays.length ;j++) {
			newArrays[j]= arr[i];
			i++;
		}
           	      helper(newArrays , i, mid);
          return newArrays; 	      
	}
	
	public static void helper(int []arr , int pass , int col) {
		 //break condition
			if(pass == 0) {
				return;
			}
			// comparing  everyelement in each pass
			if(col<pass-1) {
				//check if current element is greater than next  element if yes then swipe
				if(arr[col]>arr[col+1]) {
					swap(arr , col , col+1);
				// now check for next cols  in same pass 
				}
					helper(arr, pass, col+1);
			}
				
				else {
					//  first pass largest element is sent in end and check for second last element  check from starting 
					helper(arr, pass-1, 0);
				}
			}
	private static void swap(int[] arr, int s , int e) {
        int temp  = arr[s];
        arr[s] =arr[e];
        arr[e] =temp;
	}


}
