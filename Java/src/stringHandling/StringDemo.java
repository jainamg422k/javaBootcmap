package stringHandling;

public class StringDemo {

	public static void main(String[] args) {
//     String s1 = "six";
//     String s2 = new String("Seven");
//     char c[] = {'a','e','i','o', 'u'};
//     String s3 = new String(c);
//     byte b[] = {65,64,63};
//     String s4 = new String(b);
//     
//     System.out.println(s1);
//     System.out.println(s3);
//     System.out.println(s2);
//     System.out.println(s4);
     
		  String s1 = "Hello";
		  String s2 = "Hello World";
		  
		  System.out.println(s1 == s2);
		  System.out.println(s1.equals(s2));
		  
		  
		  User user1= new User(1 ,"abc");
		  User user2 = new User(2 , "xy");
		  
		  System.out.println(s2.substring(2));
		  System.out.println(s2.subSequence(3, 5));
		  
		  
		 String[] s =  s2.split(" ");
		 for (String string : s) {
			 System.out.println(string);	
		}
		 
		 
		  
	}

}
