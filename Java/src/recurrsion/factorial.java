package recurrsion;

public class factorial {

	public static void main(String[] args) {
		int n =5;
	System.out.println("Factorial of "+  n +"is" + fact(n) );

	}
	 public static int fact(int n) {
		 if (n==1) {
			 System.out.println("1");
			 return 1;
		 }
		int ans =n*fact(n-1);
		System.out.println(ans);
		return ans ;
		
	 }

}
