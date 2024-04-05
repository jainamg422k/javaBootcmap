package searching;

public class minNumber {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	// Finding minimum in  an array
//
//   int [][] nums = {{2,45,3,5,6,2,9,8,1},{81,5,4,6,7,83,0,9,6,4,3,5,6}};
//   System.out.println(min(nums));
//	}
//
//	static int  min(int [][] arr ) {
//		int min = Integer.MAX_VALUE;
//		for(int i=0 ; i<arr.length ;i++) {
//			for(int j=0; j<arr[i].length ;j++) {
//			System.out.println(arr[i][j]);
//			if(arr[i][j]<min) {
//				
//				min= arr[i][j];
//			 }
//			}
//		}
//		return min;
//	}

	
	//2 Findind count of even numbers in array

	public static void main(String[] args) {
	  int[] nums = {12,345,2,6,7896};
	  System.out.println(TotalEven(nums));
	  
	  int c ='a';
	  int z ='z';
	  char []ch = {'a' , 'b'};
	  int a = ch[0];
	  System.out.println(c + " " +z +" "+ a);
	  System.out.println((int)ch[0]);
	}
	public static  int TotalEven(int []arr) {
		int sum =0;
		int count ;
		
		for(int i: arr) {
			count =0;
			while(i>0) {
				int reminder = i%10;
				count++;
			 i = i/10;
				
			}
			if(count%2==0) {
				sum ++;
			}
		}
		return sum;
	}
}

