package stringHandling;

public class RemoveChar {

	public static void main(String[] args) {
		String str = "baccad";
		String ans = new String();
		System.out.println(str.charAt(2));
		System.out.println(str.length());
		for(int i = 0 ; i<str.length() ; i++) {
	    	 if(str.charAt(i)!='a') {
	    		 ans += str.charAt(i);
	    	 }
	    }
		System.out.println(ans);
	}
    
}
