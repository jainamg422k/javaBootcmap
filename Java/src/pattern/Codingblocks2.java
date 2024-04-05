package pattern;

public class Codingblocks2 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Scanner sc = new Scanner (System.in);
			int n = 4;
			int nrow = 1;
			while(nrow <= n) {
				int nst = 1;
				while(nst<=n) {
				  System.out.print("*\t"); // \t for tab space
					nst++;
				}
				System.out.println();
	    	nrow++;
			}
			
		}

	}

