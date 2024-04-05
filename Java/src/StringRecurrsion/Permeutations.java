package StringRecurrsion;

import java.util.*;

public class Permeutations {

	public static void main(String[] args) {
		permeutations("", "abc");
		ArrayList<String>ans =permeutations2("", "abc");
		System.out.println(ans);

	}
	// Printing subset without returning 
	public static void  permeutations(String p , String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		
		for(int i =0 ;i<=p.length();i++) {
			String first = p.substring(0,i);
			String second =p.substring(i, p.length());
			permeutations(first+ch+second, up.substring(1));
		}
	}
	
	//Returning the arrayList of subset
	
	public static ArrayList<String> permeutations2 (String p , String up){
		if(up.isEmpty()) {
	      ArrayList<String> ans1 = new ArrayList<>();
	      ans1.add(p);
			return ans1;
		}
		 char ch = up.charAt(0);
		 ArrayList<String> ans = new ArrayList<>();
		
		 
		for(int i = 0 ; i<=p.length();i++) {
			String first =  p.substring(0 , i);
			String second = p.substring(i,p.length());
			ans.addAll(permeutations2(first+ch+second,up.substring(1)));
			
		}
		return ans;
		 
		
	}

}
