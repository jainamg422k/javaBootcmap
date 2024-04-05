package array;

public class SearchString {

	public static void main(String[] args) {
       String name = "Kunal";
        char c = 'u';
        
        System.out.println(searchChar(name, c));
	}
    static boolean searchChar(String str ,char c) {
         for(int i= 0 ; i<str.length();i++) {
        	 if(str.charAt(i)== c) {
        		 return true;
        	 }
         }
         return false;
    }
}
