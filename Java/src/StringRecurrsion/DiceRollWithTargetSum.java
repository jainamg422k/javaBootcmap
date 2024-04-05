package StringRecurrsion;

import java.util.ArrayList;

public class DiceRollWithTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DiceRoll(" ", 4);
      System.out.println(DiceRoll2(" ", 4));
	}
	//Printing ans
	public static void DiceRoll(String p , int target) {
		if(target == 0 ) {
			System.out.println(p);
			return;
		}
		for(int i = 1 ; i<=6 && i<=target ; i++) {
			DiceRoll(p+i, target-i);
			
		}
	}
	
	public static  ArrayList<String>DiceRoll2(String p , int target) {
		if(target == 0 ) {
			ArrayList<String> lst  = new ArrayList<>();
			lst.add(p);
			return lst;
			
		}
		ArrayList<String> ans  = new ArrayList<>();
		
		for(int i = 1 ; i<=6 && i<=target ; i++) {
			
		ans.addAll(	DiceRoll2(p+i, target-i));
			
		}
return ans;
}
}
