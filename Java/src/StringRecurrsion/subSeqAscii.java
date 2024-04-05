package StringRecurrsion;

import java.util.ArrayList;

public class subSeqAscii {

	public static void main(String[] args) {
		 subSeqASCII("" , "abc");
		 System.out.println(subSeqRetASCII("" , "ab"));
		 

	}
	public static void subSeqASCII(String p , String up) {
	     if(up.isEmpty()) {
	    	System.out.println(p);
	    	return;
	     }
	     
	       subSeqASCII(p+up.charAt(0) , up.substring(1));
	       subSeqASCII(p,up.substring(1));
	       subSeqASCII(p + (up.charAt(0)+0), up.substring(1));
	}
	
	//2nd returning Array List of String Sub sequence
	public static ArrayList<String> subSeqRetASCII(String p , String up){
		//base condition
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
	  ArrayList<String>first	= subSeqRetASCII(p+up.charAt(0) , up.substring(1) );
	  ArrayList<String> second =subSeqRetASCII(p ,up.substring(1));
	  ArrayList<String>third	= subSeqRetASCII(p+(up.charAt(0)+0) , up.substring(1) );
	  first.addAll(second);
	  first.addAll(third);
   	  return first;
	}
	
	

}
