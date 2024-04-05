package StringBuffer;

public class ReverseString {
     public String firstWay(String actual) {
    	 String reversed = "";
    	 for (int i =actual.length(); i>0 ; i-- ) {
    		 reversed = reversed + actual.charAt(i-1);
    	 }
    	 return reversed;
     }
     
	public static void main(String[] args) {
         String str ="Bharath";
      ReverseString  sr = new ReverseString();
      System.out.println(sr.firstWay(str));
	}

}
