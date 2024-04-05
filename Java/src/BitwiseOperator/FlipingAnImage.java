package BitwiseOperator;

import java.util.Arrays;

public class FlipingAnImage {

	public static void main(String[] args) {
		int [][]image = {{1,1,0} ,{1,0,1} , {0,0,0}};
	flipImage(image);
		for(int row = 0 ; row<image.length;row++) {
		System.out.println(Arrays.toString(image[row]));
		}
	}
	
	static  void flipImage(int[][]image) {
		 for(int row =0 ; row< image.length ; row++) {
			 
			int start = 0;
			int end = image[row].length-1;
			
			while(start<=end) {
				swap(image ,row , start , end);
				
				 start++;
				 end--;
					
			}
			
			for(int col = 0 ; col< image[row].length ; col++) {
				image[row][col] = image[row][col]^1;
			}
		 }
	}
	
	static  void swap(int[][]arr ,int row , int start , int end ) {
		int temp = arr[row][start];
		arr[row][start] =arr[row][end];
		arr[row][end] = temp;
	}

}
