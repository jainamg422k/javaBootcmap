package practicejava;

public class PrimeNumbers {

	public static void main(String[] args) {
	int n =40 ; 
	
	/* 1 st approach   run a from 2 till n */
	/*
	for(int i = 2 ; i< n ; i++) {
		if(n%i == 0) {
			System.out.println(n+" is not prime number");
			 break;
		}
		
	}
    System.out.println(n +" is prime numbers");
*/
     for(int i = 1 ; i<=n  ; i++) {
    	boolean Prime = isPrime(i);
    	  if(Prime) {
    		 System.out.println(i + "is the Prime Number"); 
    	  }
    	}
	}
	
	static boolean isPrime(int n) {
		/*Approach check till square root of n */
		int c = 2;
	 while(c*c <=n) {
		 if (n % c == 0) {
			 return false;
		 }
		 c++;
	 }
	 return true;
	}

}
