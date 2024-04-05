package recurrsion;

public class FibonacciNumbers {


	public static int  Fibonacci(int n) {
		if(n==0 ) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int sum = Fibonacci(n-1) +Fibonacci(n-2);
		return sum ;
	}
	public static void main(String[] args) {
		
int ans =Fibonacci(4);
System.out.println(ans);
	}

}
