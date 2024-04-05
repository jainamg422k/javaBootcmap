package practicejava;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(gcd(2,15));
      System.out.println(lcm(2,15));
	}

	static int gcd(int a , int b) {
		if(a==0) {
			return b;
		}
		return gcd(b%a , a);
	}
	
	static int lcm(int a , int b) {
		
		return a*b/gcd(a,b);
	}
}
