package stringsKunal;

public class Comparision {

	public static void main(String[] args) {
//		 String a = "Kunal";
//		 String b = "Kunal";
//		 
//		  System.out.println(a==b);
//		  String c  = new String("Kunal");
//		  String d  = new String("Kunal");
//		  System.out.println(c.equals(d));
//         System.out.println(a.charAt(0));
		
//	 float a = 453.127f;
////	 System.out.printf("%.2f",a);
//	 System.out.printf("%.3f" ,Math.PI);
//	 System.out.println();
//	 System.out.printf("My name is %s and I am a good %s" , "Jainam" ,"Boy");

		
String series = "";
for(int i =0 ; i<26; i++) {
	char ch = (char)('a'+i);
	series+=ch;
	System.out.println(ch);
}
System.out.println(series);
	}

}
