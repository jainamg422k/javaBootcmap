package practicejava;

public class SquareRoot {

	public static void main(String[] args) {
    int  n = 40;
    int p =3; //precession
     squareRoot(n , p);
	}
	public static void squareRoot(int n , int p) {
		int ans = binarySearch(0, n , n);
		System.out.println("Final answer is " +" "+ ans);
		
		 double root = 0.0;
		 double incr =0.1;
		 for(int i = 0 ; i<=p ; i++) {
			while(root * root <= n) {
				root +=incr;
			} 
		 }
		 System.out.printf("%.3f" ,root-=incr);
		 incr/=10;
	}
    public static int binarySearch( int s , int e , int n  ) {
    	int ans =0;
    	while (s<e) {
    		int mid = (s+e)/2;
    		if(mid *mid >n) {
    			
    			e = mid-1;
    		}
    		else if (mid *mid < n) {
    			
    			s = mid +1;
    		}
    		else {
    			  return mid;
    			
    		}
     
     	}

    	return -1;	
    }
}
