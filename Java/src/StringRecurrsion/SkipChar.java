package StringRecurrsion;

public class SkipChar {

	public static void main(String[] args) {
	String str = "baccad";
	System.out.println(checkChar(str, 0, new String()));
	System.out.println(checkChar2(str , 0));
	skip( "","abbbca");
	System.out.println(skip2("abbbca"));

	}
	
	//1st Approach  calls answer variable  at every pass
	public static String checkChar(String str , int i , String ans) {
		//base condition
		if( i == str.length()) {
			return ans;
		}
		
		if(str.charAt(i) !='a' ) {
			ans+=str.charAt(i);
		}
		
		return checkChar(str, i+1, ans);
	} 
	
	//2nd Approach creating new object at every pass 
	
	public static String checkChar2 (String str , int i) {
		String ch = new String();
		if(i== str.length()) {
			return ch;
		}
			if(str.charAt(i)!= 'a') {
				ch+=str.charAt(i);
			}	
			
		String ans	=checkChar2(str, i+1 );
		return ch+=ans;
	}
	
	//3rd approach just by passing two string 
	 //where p = processed (new string) and up = unprocessed (orginal string)
  public static void skip(String p  , String up) {
	  // base condition
	  if(up.isEmpty()) {
		  System.out.println("Proccessed String is" + " "+ p);
		  return;
	  }
	  
	  char ch = up.charAt(0);
	  
	  if(ch == 'a') {
		  skip(p, up.substring(1));
	  }
	  else {
		  skip(p+=ch, up.substring(1));
	  }
  }
  
  //4th Approach just by passing String  and returning the String
  public static String skip2(String up) {
	  // base condition
	  if(up.isEmpty()) {
		  
		  return " " ;
	  }
	  
	  char ch = up.charAt(0);
	  
	  if(ch == 'a') {
		 return  skip2( up.substring(1));
	  }
	  else {
		return   ch+ skip2 (up.substring(1));
	  }
  }
}
