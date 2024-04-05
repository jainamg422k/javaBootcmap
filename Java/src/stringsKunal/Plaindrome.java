package stringsKunal;

public class Plaindrome {
     public static boolean checkPalindrome( String str) {
    	 int start = 0;
    	 int end = str.length()-1;
    	 
    	 while(start<=end) {
    		 if(str.charAt(start)!=str.charAt(end)){
    			 return false;
    			 
    		 }
    		 else {
    			 start++;
    			 end++;
    		 }
    	 }
    	 return true;
     }
	
	public static void main(String[] args) {
      String  str = "abcdcbav";
      if(checkPalindrome(str)) {
    	  System.out.println("String is palindrome");
      }
      else {
    	  System.out.println("String is not palindrome");
      }
	}

}
