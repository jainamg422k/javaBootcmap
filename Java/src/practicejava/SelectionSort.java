package practicejava;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	       int num =  32145;
	       int invNum = 0;
	       int place = 1;
	       System.out.println("plce" + " " + "digit");
	       while(num>0) {
	    	   int digit = num% 10;
	    	   //System.out.println(place + " " + digit);
	    	   int invPlace = digit;
	    	   int invdigit = place;
	    	   invNum = (int) (invNum +  invdigit * Math.pow(10, invPlace-1));
	    	  
	    	   System.out.println(invPlace + " "+ invdigit);
               num/=10;
               place++;
	       }
	       System.out.println(invNum);
	}

}
	