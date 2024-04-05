package StringRecurrsion;
import java.util.*;
public class Subset {
// Practice  List  the list 
	public static void main(String[] args) {
		  List<List<Integer>>lis = new ArrayList<>();
	
		lis.add(new ArrayList<>());
		   
		  System.out.println(lis);
		 
		  List<Integer>lis2 = new ArrayList<>(lis.get(0));
		  System.out.println(lis2);
		  lis2.add(3);
		  lis2.add(1);
		  lis2.add(4);
		  lis.add(lis2);
		  System.out.println(lis2);
		//  lis.add(0, lis2);
		List<Integer>lis3= new ArrayList<>(lis.get(1));
		lis3.add(5);
		lis.add(lis3);
		//  System.out.println(lis2);
		  System.out.println(lis);
			
		
	int n =lis.size();
	for(int i =0 ; i<n ; i++) {
		List<Integer>in = new ArrayList<> (lis.get(i));
		in.add(6);
		lis.add(in);
		
	}
	System.out.println(lis);
 }

}
