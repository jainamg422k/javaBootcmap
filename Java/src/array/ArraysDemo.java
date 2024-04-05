package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		/*
//         int arr[] = new int[5];
//         arr[0] = 30;
//         arr[1] = new Integer(20);
//         arr[2] = 30;
//         
//         
//          for(int element : arr) {
//        	  System.out.println(element);
//          }
		
		
//		int[]arr = {5,3,5,6,3,5};
//		int sum = 0;
//		
//		for(int i = 0 ; i<arr.length; i++) {
//		
//			sum +=arr[i];
//			}
//		System.out.println(sum);
		
		*/
		
//    char [] ch = {'a' , 'b','c','d','a'};
//    
//     if(ch[0]==ch[ch.length-1]) {
//     System.out.println("both are same");
//     } 
		
		Scanner sc = new Scanner(System.in);
//		int [] arr = new  int[5];
//		for(int i = 0 ; i<arr.length ;i++) {
//			arr[i] =sc.nextInt();
//		}
//		for (int i : arr) {
//			 System.out.println(i);
//		}
		
		ArrayList< Integer>list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(60);
		
		System.out.println(list);
     
		
    int []arr = {1,3,23,9,18};
    int range1 = 3;
    int  range2 = arr.length;
    System.out.println(Arrays.toString(arr)); 
    swap(arr , 1 ,3);
    System.out.println(Arrays.toString(arr)); 
    
    
    System.out.println(max(arr));
    System.out.println(max(arr , range1 , range2));
    	
    }
	public static void swap(int []arr , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static int max(int[]arr) {
		int maxVal = Integer.MIN_VALUE;
		for(int i =0 ; i< arr.length ; i++ ) {
			if(arr[i]> maxVal) {
				maxVal = arr[i];
			}
		}
		 return maxVal;
	}
	static int max(int[]arr , int range1 , int range2) {
		int maxVal = Integer.MIN_VALUE;
		for(int i =range1 ; i< range2 ; i++ ) {
			if(arr[i]> maxVal) {
				maxVal = arr[i];
			}
		}
		 return maxVal;
	}
	
	
         }
          
	


