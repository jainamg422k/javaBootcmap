package recurrsion;

public class Nto1 {
     public static void fun(int n) {
    	 if(n==0) {
    		 return;
    	 }
    	 System.out.print(n+ " ");
    	 fun(n-1);
    	 
    	 System.out.print(n+" ");
     }
	public static void main(String[] args) {
		 fun(5);
  }

}
