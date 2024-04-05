package patternViaRecurrsion;

public class Triangle {

	public static void main(String[] args) {
      triangle(4, 0);
      triangle2(4,0);
	}
	public static void triangle(int r , int c) {
		// base condition
		if(r == 0) {
			return;
		}
		
		//1st working 
		if(c<r) {
			triangle(r, c+1);
	      System.out.print("*");
	      
		}
		else {
			triangle(r-1, 0);
			System.out.println();
			
		}
	}
	public static void triangle2(int r , int c) {
		// base condition
		if(r == 0) {
			return;
		}
		
		//1st working 
		if(c<r) {
			triangle(r, c+1);
	      System.out.print("*");
	      
		}
		else {
			triangle(r-1, 0);
			System.out.println();
			
		}
	}

}
