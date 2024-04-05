package practicejava;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int [][] arr=  new int[4][];
		  
	/*	
	  arr[0] = new int[sc.nextInt()];
	  System.out.println(arr[0].length);
	  for(int i =  0 ; i < arr[0].length;  i++ ) {
		  arr[0][i] = sc.nextInt();

	}
	
	*/
		  
	  for(int row = 0 ; row< arr.length; row++) {
		   System.out.println("column size daalo");
		  arr[row] = new int[sc.nextInt()];
		 for(int col =0; col < arr[row].length;col++) {
			 arr[row][col] = sc.nextInt();
		 }
	  }
	  for(int[] e : arr) {
		  System.out.println(Arrays.toString(e));
	  }

}
}