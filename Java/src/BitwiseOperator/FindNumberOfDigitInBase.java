package BitwiseOperator;

public class FindNumberOfDigitInBase {

	public static void main(String[] args) {
		 int n = 10;
		 int count =0;
		 while(n>0) {
			  count++;
			 
			 n= n>>1;
			 
			  
		 }
		 
//	int 	c = 1<<n-1; // solution of for  sum of nth pascal triangle
	//	 System.out.println(c);
		 System.out.println(count);

	}

}
