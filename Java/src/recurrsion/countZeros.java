package recurrsion;

public class countZeros {

	public static void main(String[] args) {
		int n = 30204;
		zerosC(n);
		System.out.println(count);
		System.out.println(countZero(n));
	}
	
	// 1st approach  by taking global variable
    static int count = 0;
    static void zerosC(int n) {
    	if(n/10 == 0) {
    		return ;
    	}
    	
    	int rem = n%10;
    	 if(rem == 0) {
    		 count++;
    	 }
    	 zerosC(n/10);
    	
    }
  //2nd approach by taking helper class
    
  static int countZero(int n) {
	   int count = 0;
	  return  helper(n,count );
  }
  static int  helper(int n  , int count) {
	  if( n/10 ==0) {
		  return count;
	  }
	  int rem  = n%10;
	  if(rem== 0) {
		  return  helper(n/10, count+1);
	  }
	  return helper(n/10 , count);
  }
}
