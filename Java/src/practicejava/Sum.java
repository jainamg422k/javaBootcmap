package practicejava;
import java.util.*;
public class Sum {
	public static int sum() {
		Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
		return num1+ num2;
		
	}
	
	public static String greet( ) {
		String gretting = "Good Morning";
		return gretting;
	}
	
   public static String greeting(String name) {
	   return "Hello" + ""+  name;
   }	

	public static void main(String[] args) {
      
		System.out.println(sum()); 
		System.out.println(greet());
 	    String ans = greeting("Jainam");
 	    System.out.println(ans);
       
	}

}
