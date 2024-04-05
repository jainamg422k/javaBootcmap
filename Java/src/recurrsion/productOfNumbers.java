package recurrsion;

public class productOfNumbers {

	public static void main(String[] args) {
		System.out.println(productOfDigit(1342));
	}
	static int  productOfDigit(int n) {
		  // break condition
		 if(n%10 == n) {
			 return n;
		 }
		 
		 int rem = n%10;
		 int dividend = productOfDigit(n/10);
		 return rem*dividend;

}
}
