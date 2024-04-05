package recurrsion;

public class NumberofSteps {

	public static void main(String[] args) {
		System.out.println(steps(8));

	}
	public static int steps(int n) {
		 int steps = 0;
		 return helper( n , steps);
	}
	private static int helper(int n , int s) {
		if(n==0) {
			return s;
		}
		if(n%2==0) {
			return helper(n/2, ++s);
		}
		return helper(n-1, ++s);
	}

}
