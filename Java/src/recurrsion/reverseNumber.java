package recurrsion;

public class reverseNumber {

	public static void main(String[] args) {
		reverse1(13245);
      System.out.println(sum);
      System.out.println(rev2(13245));
	}
	//1st approach
    static int sum = 0;
    static void reverse1(int n) {
    	 if(n== 0) {
    		 return;
    	 }
    	 
    	 int rem = n%10;
    	 sum = sum*10+rem;
    	 reverse1(n/10);
    }
 ////////////////////////////////////////////////////////////
 //2nd Approach
 static int rev2(int n) {
	 int  digits = (int)(Math.log10(n))+1;
	  System.out.println(digits);
	 return helper(n , digits);
 }
 
 private static int helper(int n , int digits) {
	 if(n%10==n) {
		 return n;
	 }
	 int rem = n%10;
	 return rem *(int)Math.pow(10, digits-1) + helper(n/10 , digits-1);
 }
  

}
