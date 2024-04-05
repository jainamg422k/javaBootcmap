package practicejava;

public class NewtonSQRT {

	public static void main(String[] args) {
     double n = 36;
     System.out.println(sqrt(n));
	}
  static double sqrt(double n) {
	 double x =n;
	 double root;
	 while(true) {
		 root = 0.5 *(x+(n/x));
		  if(Math.abs(root-x)<1) {
			  break;
		  }
	 x = root; 
	 }
  return root;
  }
}
