package StringRecurrsion;

import java.util.*;

public class SubsetOFN {

	public static void main(String[] args) {
		int[]arr = {1,2,3};
		
List<List<Integer>>ans=(subset(arr));
for(List<Integer>n:ans) {
	System.out.println(n);
}
		

	}
	
	public static List<List<Integer>>subset(int []arr){
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
	   for(int nums:arr) {
		   int n = outer.size();
		   for(int i = 0 ; i<n ; i++) {
			   List<Integer> internal = new ArrayList<Integer>(outer.get(i));
			   internal.add(nums);
			   outer.add(internal);
			   
		   }
	   }	
	
		
		return outer;
	}

}
