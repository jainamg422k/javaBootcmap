package searching;

public class LinearSearch {

	public static void main(String[] args) {
      int [] nums =  {1,2,3,4,5,6,7,8,9};
      int target =5;
      int range1 =1;
      int range2 =6;
      
      System.out.println(linearSearch(nums, target));
      System.out.println(searchBetween(nums, range1, range2, target));
	}
    public static  int  linearSearch(int []arr , int target) {
    	 if (arr.length == 0) {
    		 return -1;
    	 }
    	 
    	 for (int i = 0 ; i<arr.length;i++) {
    		 if(arr[i]== target) {
    			 return i;
    		 }
    	 }
    	 return -1;
    }
    
    public static  boolean searchBetween(int[]arr , int range1 , int range2 , int target) {
    	for(int i =range1 ; i<range2 ;i++) {
    		 if(arr[i]== target) {
    			 return true;
    		 
    	}
    		 
    }
    	return false;	
	}
}
