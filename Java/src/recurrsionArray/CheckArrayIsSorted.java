package recurrsionArray;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr = {1,2,4,8,9,12};
     System.out.println(checkArr(arr, 0));
	}
	public static boolean checkArr(int []arr ,int  i) {
		if (i == arr.length-1) {
			return true;
		}
		 return arr[i]<arr[i+1] && checkArr(arr, ++i);
	}

}
