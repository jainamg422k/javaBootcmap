package StringRecurrsion;
import java.util.ArrayList;
public class LetterCombinations {

	public static void main(String[] args) {
     pad(" ", "12");
     System.out.println(padRet("", "12"));
     System.out.println(padCount("", "12"));
     

	}
	//Printing the value not returning anything
	public static void pad(String p , String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		
		int digit  = (int) up.charAt(0)-'0';  // this will convert '2' into int 2;
		
		//run loop of specfic char 
	
		for(int i = (digit-1)*3 ; i<digit*3;i++) {
			
			char ch =  (char) ('a'+ i);
	
			pad(p+ch, up.substring(1));
			
		}
		
		
	}
	
	//Returning the arrayList
	
	public static ArrayList<String> padRet(String p , String up) {
		if(up.isEmpty()) {
			ArrayList<String> lst  = new ArrayList<>();
			lst.add(p);
			return lst;
		}
		
		
		int digit  = (int) up.charAt(0)-'0';  // this will convert '2' into int 2;
		
		//run loop of specfic char 
		ArrayList<String> ans  = new ArrayList<>();
	
		for(int i = (digit-1)*3 ; i<digit*3;i++) {
			
			char ch =  (char) ('a'+ i);
	
			ans.addAll(padRet(p+ch, up.substring(1)));
			
		}
		return ans;

}
	
//3question  count returning the count 
	
	public static int padCount(String p , String up) {
		if(up.isEmpty()) {
			
		
			return 1;
		}
		
		
		int digit  = (int) up.charAt(0)-'0';  // this will convert '2' into int 2;	
		int count = 0;
		//run loop of specfic char 
		ArrayList<String> ans  = new ArrayList<>();
	
		for(int i = (digit-1)*3 ; i<digit*3;i++) {
			
			char ch =  (char) ('a'+ i);
	
		count = count + padCount(p+ch, up.substring(1));
			
		}
		return count;

}

}
