package practicejava;

import java.util.Scanner;

public class HelloWorld {
	   public static void main(String[]args) {
		  Scanner sc = new Scanner(System.in);
		  int  sum =0 ;
		  //gcd lcm
//		  int num1 =  sc.nextInt();
//		  int num2 = sc.nextInt();
//		  int gcd = 0;
//		  for (int i=1 ; i <= num1 ;i++) {
//			  if(num1%i==0 && num2%i==0  ) {
//				  gcd = i;
//			  }
//		  }
//		  System.out.println(gcd);
//		
//		int lcm = (int)(num1*num2/gcd);
//		System.out.println(lcm);
		  
		  int  num1;
     while(true) {
    		 num1 = sc.nextInt();
    		 
    		//int num2 = sc.nextInt();
    	if (num1 == (int)'x') {
    		break;
    	}
         sum = sum + num1; 
     }
		System.out.println(sum);
	   
 }
}