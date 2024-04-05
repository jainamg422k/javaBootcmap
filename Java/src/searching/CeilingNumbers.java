package searching;

public class CeilingNumbers {
	// for the of the number 

	public static void main(String[] args) {
       int []arr = {2,3,5,9,14,16,18};
       int target = 4;
       System.out.println("CeilingNumber is "+Ceiling(arr, target));
       System.out.println("Floor Number is "+ floorNumber(arr, target));
	}
	
	//Return Smallest number>= target
	public static int Ceiling(int []arr , int target) {
		if (target > arr[arr.length-1]) {
			return -1;
		}
		 int s = 0;
		 int e =arr.length;
		 int position =-1;
		 while (s<=e) {
		int mid = (s+e)/2;
		if(arr[mid]== target) {
			position = arr[mid];
			return position;
		}
		else if(arr[mid]< target)  {
			s = mid +1;
		}
		else {
			e = mid-1;
		}
		 }
		 return arr[s];
	}
	//Return Greatest number<= target
	public static int floorNumber(int []arr , int target) {
		if (target < arr[0]) {
			return -1;
		}
		
		 int s = 0;
		 int e =arr.length;
		 int position =-1;
		 while (s<=e) {
		int mid = (s+e)/2;
		if(arr[mid]== target) {
			position = arr[mid];
			return position;
		}
		else if(arr[mid]< target)  {
			s = mid +1;
		}
		else {
			e = mid-1;
		}
		 }
		 return arr[e];
	}

}
