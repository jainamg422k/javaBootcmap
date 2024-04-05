package oops;

import java.lang.ArrayIndexOutOfBoundsException;

public class Test {
	
	public static void main(String[]args) {

        int arr[] = {10 ,20, 30};
       try {
    	   System.out.println("Elements of the  array are :");
       	for(int i = 0 ; i<=arr.length ;i++) {
       		System.out.println(arr[i]);
       	}   
       }catch (ArrayIndexOutOfBoundsException f ){
    	   System.out.println("eee");
       }
       
        	
        
		 
		
		
	}

}
