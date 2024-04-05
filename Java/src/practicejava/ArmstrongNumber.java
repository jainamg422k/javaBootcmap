package practicejava;

public class ArmstrongNumber {
     public static void armstrong (int n) {
    	 int a = n;
    	 int total = 0;
    	 while(a>0) {
    		 int rem = a%10;
    		  total = total +rem * rem* rem;
    		   a = a/10;
    	 }
    	 if(n == total) {
    		 System.out.println( n+ " number is Armstrong");
    	 }
     }	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num  = 178;
      armstrong(num);
	}

}
