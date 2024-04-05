package BitwiseOperator;

public class MagicNumber {

	public static void main(String[] args) {
		int n = 6;
		int base = 5 ;
		int ans =0;
		while(n>0) {
			
			// getting last binary digit
			int last = n & 1;
			// shifting to  next left digit 
			 n =n>>1;
			// adding where the  binary is 1 
			 ans += last *base;
			 // increasing the power of base 
			 base = base* 5;
		}
System.out.println(ans);
	}

}
