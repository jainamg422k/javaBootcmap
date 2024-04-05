package searching;

public class PeakIndexINMountain {

	public static void main(String[] args) {
    int []arr = {1,2,3,4,5,6,8,4,3,2,1};
    int []arr1 = {3,4,5,6,7,0,1,2};
    
    System.out.println("Index is "+peak(arr));
    System.err.println("Index is "+peak(arr1));
	}
	public static int  peak(int []arr) {
		int start = 0;
		int end = arr.length-1;
		while (start < end) {
			int mid = (start+end)/2;
			if(arr[mid]>arr[mid+1]) {
				end  = mid;
			}
			else {
				start = mid+1;
			}
		}
		return start;
	}

}
