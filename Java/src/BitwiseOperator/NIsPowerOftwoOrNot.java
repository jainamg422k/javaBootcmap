package BitwiseOperator;

public class NIsPowerOftwoOrNot {

	public static void main(String[] args) {
		int number =8;
        int n = number;
        int count =0;
      //1st approach  by counter method
       while(n>0) {
    	int  b=  n&1;
    	 System.out.println( "n is " + b);
    	 if (b==1) {
    		 count ++;
    	 }
    	 n= n>>1;
       }
       
       if (count== 1) {
    	   System.out.println("count is  " +count + " "+number +" "+"is  power of 2");
       }
       else {
    	   System.out.println("count is  " +count + " "+number +" "+"is not power of 2");
       }
       
     //2nd approach
      boolean ans = (n & (n-1))==0;
      if(ans = true) {
      System.out.println(ans +" " +"Number is power of 2");
      }
      else {
    	  System.out.println(ans+" " +"Number is not power of 2");
      }
       
	}

}
