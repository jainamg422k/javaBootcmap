package stringHandling;

public class Immutable {

	public static void main(String[] args) {
          String s1  = "Hello";
          String s2 = "world";
          
          System.out.println("Before Concat" +"\n" +s1 +"\n"+ s2);
           String s3 = s1.concat(s2);
           System.out.println(s3);
	}

}
