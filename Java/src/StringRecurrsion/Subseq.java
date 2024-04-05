package StringRecurrsion;

import java.util.ArrayList;

public class Subseq {

	public static void main(String[] args) {
      subSeq(" ", "abc");
      ArrayList<String> s = new ArrayList<>();
      subSeq2("", "abc", s);
      System.out.println(s);
      System.out.println(subSeqRet(" ","abc"));

	}
	
	//1st Approach 
	// Printing subSequence  in we trim all orginal string
	public static void subSeq(String p , String up) {
	     if(up.isEmpty()) {
	    	System.out.println(p);
	    	return;
	     }
	     
	       subSeq(p+up.charAt(0) , up.substring(1));
	       subSeq(p,up.substring(1));
	}
	
	//2nd Approach
	//Adding SubSeq  to the ArrayList of SubString 
	public static ArrayList<String> subSeq2(String p , String up , ArrayList<String> s) {
	     if(up.isEmpty()) {
	    	s.add(p);
	    	return s;
	     }
	     
	       subSeq2(p+up.charAt(0) , up.substring(1), s);
	       return  subSeq2(p ,up.substring(1),s);
	}
	
	//3rd Approach 
	//Creating new Array list within a function and returning it
	
	public static ArrayList<String> subSeqRet(String p , String up){
		//base condition
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
	  ArrayList<String>left	= subSeqRet(p+up.charAt(0) , up.substring(1) );
	  ArrayList<String> right =subSeqRet(p ,up.substring(1));
	  left.addAll(right);
	  return left;
	}
   

}
