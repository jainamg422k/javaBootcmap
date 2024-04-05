package ncapsulation;
import java.lang.*;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		
try{
	String input  = args[0];
    System.out.println("Input is " + input);
    
    int output = Integer.parseInt(input);
    
    System.out.println("Output is" + output);
}catch(Exception e) {
	System.out.println("Input is reqired ");
}
     
	}
	

}
