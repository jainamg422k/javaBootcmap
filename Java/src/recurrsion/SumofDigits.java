package recurrsion;

public class SumofDigits {

	public static void main(String[] args) {
    int n = 1342;
    // 1st Approach  without recurssion
    int sum = 0;
    while(n>0) {
    	int rem = n%10;
    	sum+=rem;
    	n=n/10;
    	
    }
    System.out.println(sum);
    
    System.out.println(sumOfDigit(13421));
	}
	
//2nd approach with recursion
 static int  sumOfDigit(int n) {
	  // break condition
	 if(n == 0) {
		 return 0;
	 }
	 
	 int rem = n%10;
	 int dividend = sumOfDigit(n/10);
	 return rem+dividend;
	 
	 
 }

}
