package pattern;

public class Codingblocks {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Scanner sc = new Scanner (System.in);
			int n = 8;
			int nstb = n/2;
		     int nsp = 1;
		     int nsta = n/2;
		       for (int row =1; row <= n; row++ ) {
		    	   for(int cstb = 1;cstb <= nstb; cstb++) {
		    		   System.out.print("*");
		    	   }
		    	   for(int csp = 1; csp<= nsp; csp++) {
		    		   System.out.print(" ");
		    	   }
		    	   for(int csta = 1;csta <= nsta; csta++) {
		    		   System.out.print("*");
		    	   }
		    	   if(row<=n/2) {
		    		   nstb--;
		    		   nsp+=2;
		    		   nsta--;
		    	   }
		    	   else {
		    		   nstb++;
		    		   nsp-=2;
		    		   nsta++;
		    	   }
		    	   System.out.println();
		}

	}
}


