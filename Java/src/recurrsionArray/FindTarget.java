package recurrsionArray;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTarget {

	public static void main(String[] args) {
		int [] arr = {1,2,4 ,3 ,4};
		int target = 4;
    System.out.println(TargetIndex(arr, target, 0));
    System.out.println(checkTarget(arr, target, 0));
    findAllIndex(arr, target, 0);
    System.out.println(list);
    System.out.println(findAllIndex(arr, target, 0, new ArrayList<>()));
    System.out.println("ArrayList without passing args"+" "+findAllIndex2(arr, target,0));
    
	}
	
   static int  TargetIndex(int[]arr , int target , int i) {
	   //base condition
     if(i == arr.length) {
    	return -1; 
     }
     if(arr[i]== target) {
    	 return i;
     }
     else {
    	 return TargetIndex(arr, target, i+1);
     }   }	
   
   static boolean checkTarget(int[]arr , int target , int i) {
	   //base condition
     if(i == arr.length) {
    	return false; 
     }
 return  arr[i]==target || checkTarget(arr, target, ++i);
}
static ArrayList<Integer>list = new ArrayList<>();
static  void findAllIndex(int[]arr , int target , int i) {
	if(i == arr.length) {
		return;
	}
	if(arr[i]== target) {
		list.add(i);
	
	}
	
		 findAllIndex(arr, target, i+1);
	
}

static  ArrayList findAllIndex(int[]arr , int target , int i , ArrayList<Integer>list) {
	if(i == arr.length) {
		return list;
	}
	if(arr[i]== target) {
		list.add(i);
		
	}
	
		return  findAllIndex(arr, target, i+1 ,list);
	
}

static  ArrayList findAllIndex2(int[]arr , int target , int i  ) {
	ArrayList<Integer> list = new ArrayList<>();
	if(i == arr.length) {
		return list;
	}
	
	// this will contain answer of that function call only
	if(arr[i]== target) {
		list.add(i);
		
	}
	
		ArrayList<Integer>answerFromBelowCalls =  findAllIndex2(arr, target, i+1);
	    list.addAll(answerFromBelowCalls);
	    return list;
}
}