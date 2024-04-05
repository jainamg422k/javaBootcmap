package searching;
//OrderAgnostic  


 
public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
		int []darr = {4,3,2,1,0};
		
      System.out.println(binarySearch(arr, 1));
      System.out.println(binarySearch(darr, 1));
	}
    public static int  binarySearch(int[] arr ,  int val){
    	int s  =0 ; int e = arr.length ;
    	int position =-1;
    	if (arr[0]<= arr[1]) {
    		
    
            position =-1;
    	   while (s<= e) {
    		  int mid = (s+e)/2;
    		 if(arr[mid]== val) {
    			position =mid;
    			return position;
    		 }
    		 else if (arr[mid]>val) {
    			 e =mid-1;
    		 }
    		 else {
    			s= mid+1;  
    		 }
    	   }
    	   ;
     }
    
    else {
    	while (s<= e) {
  		  int mid = (s+e)/2;
  		 if(arr[mid]== val) {
  			position =mid;
  			return position;
  		 }
  		 else if (arr[mid]>val) {
  			s  =mid-1;
  		 }
  		 else {
  			e= mid+1;  
  		 }
  	   }
    }
  	   return position;
    
 }
}
