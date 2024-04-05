package pattern;

public class PatternExpample {

	public static void main(String[] args) {
		System.out.println("Pattern1");
		pattern(4);
		
		System.out.println();
		System.out.println("Pattern2");
		
	   pattern2(4);
	   
	   System.out.println();
		System.out.println("Pattern3");
		  pattern3(4);
		  
		   System.out.println();
			System.out.println("Pattern3");
			  pattern4(4);
			  
			  System.out.println();
				System.out.println("Pattern5");
				  pattern5(3);
				  
				  System.out.println();
					System.out.println("Pattern6");
					  pattern6(4);
					  
					  System.out.println();
						System.out.println("Pattern7");
						  pattern7(4);
						  
						  System.out.println();
							System.out.println("Pattern8");
							  pattern8(4);
							  System.out.println();
								System.out.println("Pattern10");
								  pattern10(4);
	}
	
	
     public static void pattern(int n) {
    	 for(int row =1 ; row<=n ;row++) {
    		 for(int cols = 1; cols<=row ;cols++) {
    			 System.out.print("*  ");
    		 }
    		 System.out.println();
    	 }
     }
     public static void pattern2(int n) {
    	 for(int row =1 ; row<=n ;row++) {
    		 for(int cols = 1; cols<=n ;cols++) {
    			 System.out.print("*  ");
    		 }
    		 System.out.println();
    	 }
    	 
  }
     public static void pattern3(int n) {
      for(int row = 0 ; row < n ; row++) {
    	  for(int cols =0;cols<n-row ; cols++) {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }   	 
     }
     public static void pattern4(int n) {
    	 for(int row =1 ; row<=n ;row++) {
    		 for(int cols = 1; cols<=row ;cols++) {
    			 System.out.print(cols);
    		 }
    		 System.out.println();
    	 }
     }
     
     public static void pattern5(int n) {
        int row =1;
        int nst = 1;
        while (row <= 2*n-1){
        	int cst = 1;
        	while(cst<=nst) {
        		System.out.print("*\t");
        		cst++;
        	}
        	if(row<n) {
        		nst++;
        	}
        	else {
        		nst--;
        	}
        System.out.println();
        	 row++;
        }
      
        }
 ///////////////////////////////////////////////////    
     public static void pattern6(int n) {
         int row =1;
         int nsp = 0;
         int nst = n;
         while(row<=2*n-1) {
        	 int csp =1;
        	 while(csp<=nsp) {
        		 System.out.print(" ");
        		 csp++;
        	 }
        	 int cst = 1;
        	 while(cst<=nst) {
        		 System.out.print("*");
        		 cst++;
        	 }
        	 if(row<n) {
        		 nsp+=2;
        		 nst--;
        	 }
        	 else {
        		 nsp-=2;
        		 nst++; 
        	 }
        	 System.out.println();
        	 row++;
         }
         
       }
     
     public static void pattern7(int n) {
    	 int row = 1; 
         int nsp = n-1;
         int nst = 1;
         while(row<=n) {
        	 int csp = 1;
        	 while(csp<=nsp) {
        		System.out.print(" ");
        		 csp++;
        	 }
        	 int cst = 1;
        	 while(cst<=nst) {
        		 if(cst%2!=0) {
        			 System.out.print("*");
        		 }
        		 else {
        			 System.out.print(" ");
        		 }
        		 cst++;
        	 }
        	 nsp--;
        	 nst+=2;
        	 System.out.println();
        	 row++;
         }
     }
    public static void  pattern8(int n) {
     int row =1;
     int bnst = n;
     int nsp =1 ;
     int anst  = n;
     while(row <= 2*n-1) {
    	 int bcst=1;
    	 while(bcst<bnst) {
    		 System.out.print("*");
    		 bcst++;
    	 }
    	 int csp = 1;
    	 while(csp<=nsp) {
    		System.out.print(" ");
    		 csp++;
    	 }
    	 
    	 int acst=1;
    	 while(acst<anst) {
    		 System.out.print("*");
    		 acst++;
    	 }
    	 if (row<n) {
    		 bnst--;
    		 nsp+=2;
    		 anst--;
    	 }
    	 else {
    		 bnst++;
    		 nsp-=2;
    		 anst++; 
    	 }
    	 System.out.println();
    	
    	row++;  
     }
    }
    
    public static void pattern9(int n) {
   	 int row = 1; 
        int nsp = n-1;
        int nst = 1;
        while(row<=n*2-1) {
       	 int csp = 1;
       	 while(csp<=nsp) {
       		System.out.print(" ");
       		 csp++;
       	 }
       	 int cst = 1;
       	 while(cst<=nst) {
       		 if(cst%2!=0) {
       			 System.out.print("*");
       		 }
       		 else {
       			 System.out.print(" ");
       		 }
       		 cst++;
       	 }
       	 if(row<n) {
       		 nsp--;
           	 nst+=2; 
       	 }
       	 else {
       		 nsp++;
           	 nst-=2; 
       	 }
       
       	 System.out.println();
       	 row++;
        }
    }
    
    public static void pattern10(int n) {
    	int row = 1;
    	int nsp = n-1;
    	int nst = 1;
    	while(row<=n) {
    	   int csp =1;
    	   while(csp<=nsp) {
    		   System.out.print(" ");
    		   csp++;
    	   }
    	   
    	   int cst =1;
    	   int i = row;
    	   while(cst<=nst) {
    		   if (cst <row) {
    			   System.out.print(i);
    			   i--;
    		   }
    		   else {
    			   System.out.print(i);
    			   i++;
    		   }
    		  
    		   cst++;
    	   }
    	   
    	   nsp--;
    	   nst+=2;
    		System.out.println();	   
           row++;
    	}
    }
}
