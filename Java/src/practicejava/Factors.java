package practicejava;

import java.util.ArrayList;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  factors(20);
  factors2(20);
  factors3(20);
	}
	
	//o(n)
	 public static void factors(int n ) {
		 for(int i=1; i<=n; i++) {
			 if(n%i == 0) {
				 
				 System.out.print(i + " ");
				 
			 }
			
		 }
		 System.out.println();
	 }
	  
	 public static void factors2(int n ) {
		 for(int i=1; i<=Math.sqrt(n); i++) {
			 if(n%i == 0) {
				 if (n/i== i) { //if n 36 then 6*6 so 6 should print only 1 times
					 System.out.print("  "+i ); 
				 }
				 else {
					 System.out.print("  "+i + " " + n/i);
				 }
				 
			 }
		 }
		 System.out.println();
	 }
	 
	 // 
	 public static void factors3(int n ) {
		 ArrayList<Integer> list = new ArrayList<>();
		 for(int i=1; i<=Math.sqrt(n); i++) {
			 if(n%i == 0) {
				 if (n/i== i) { //if n 36 then 6*6 so 6 should print only 1 times
					 System.out.print("  "+i ); 
				 }
				 else {
					 System.out.print("  "+i +" " );
					 list.add(n/i);
				 }
				 
			 }
			}
		 for(int i = list.size()-1 ;i>=0;i--) {
			 System.out.print(list.get(i)+ " ");
		 }
	 }

}
