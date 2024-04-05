package multithread;
import java.util.Scanner;
public class JoinDemo extends Thread {
    static   int  n , sum = 0;
	public static void main(String[] args) {
		
	long start = System.currentTimeMillis();
         System.out.println("Sum of first 'N' numbers");
         System.out.println("Enter a value ");
         Scanner sc = new Scanner(System.in);
         JoinDemo.n =  sc.nextInt();
         
         JoinDemo jd = new JoinDemo();
         jd.start();
         try {
        	 jd.join(); 
         }
         catch(InterruptedException e) {
         System.out.println("Error in  void run methods");
         }
        System.out.println("Sum of first" + JoinDemo.n + "Number is " + JoinDemo.sum);
        long ends = System.currentTimeMillis(); 
        
        System.out.println("Total time: " +  (ends-start)/1000);
	}
	
	 public void run() {
		 for(int i =1 ; i<=JoinDemo.n ; i++) {
			  JoinDemo.sum += i;
		 }
		 try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}
