package sortingAlgo;
import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] arr = { 5,3,1,5,4,0,2};
		 // 
		for(int pass =1 ; pass< arr.length ; pass++) {
			for(int i =0; i< arr.length-pass; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] =arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
