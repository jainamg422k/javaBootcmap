package polymorphism;


public class CompileTImeBinding {
	void add(int a , int b) {
		int result = a+b;
		System.out.println(result);
	}
	
	void add(float a , float b) {
		 float result = a + b;
		 System.out.println(result);
	}
	
void add(int a , int b , int c) {
	int result = a+b+c ;
	System.out.println(result);
}
  
   public static void main(String[]args) {
	    CompileTImeBinding obj = new CompileTImeBinding();
	     obj.add(5, 6);
	     obj.add(8, 9);
	     obj.add(4, 5 , 6);
   }
}

