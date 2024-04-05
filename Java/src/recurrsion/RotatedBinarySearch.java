package recurrsion;


public class RotatedBinarySearch {
   
	public static void main(String[] args) {
	 int[] arr = {5,6,7,8,9,1,2,3};
	 int target = 7;
	 System.out.println(search(arr ,target , 0 , arr.length));

	}
    public static int search(int[]arr , int target , int s , int e) {
    	if(s>e) {
    		return -1;
    	}
    	int mid = (s+e)/2;
    	if(arr[mid]== target) {
    		return mid;
    	}
    	if(arr[s]<=arr[mid]) {  // 1st half this is sorted array
    		if(target>= arr[s] && target <=arr[mid]) {
    			return search(arr, target, s, mid-1 );
    		}
    		else {
    			return search(arr, target, mid+1, e );
    		}
    	}
    	if(target>=arr[mid] && target <= arr[e]) {
    		return search(arr, target, mid+1, e );     //eg: arr[5,6,1,2,3,4]  mid =1 , t= 2
    	}
    	return search(arr, target, s, mid-1 );
    }
}
