package backtracking;

public class NQueens {

	public static void main(String[] args) {
		int n = 4;
		boolean [][] board = new boolean[n][n];
		int count =queens(board , 0);
		System.out.println(count);
	}
	public static int queens(boolean[][]board,int row) {
		if(row == board.length) {
			display(board);
			return 1;
		}
		//placing queen and checking for every row and cols
		int count = 0;
		for(int col = 0 ; col<board.length;col++) {
			//place the queen the
			 if(isSafe(board , row , col)) {
				 //once  queens is place at any cols of that row , then checing for anoter r and c 
				 //as per rule we cannot place more than 1 queen  at same row and col and 
				 board[row][col] = true;
				  count +=queens(board, row+1);
				  
				 board[row][ col] =false;
			 }
			 
		}
	
		return count;
		
	}
	public static boolean isSafe(boolean[][]board , int row , int col) {
		
	  // check vertical row 
		for(int i = 0 ; i<row ; i++) {
			if(board[i][col]) {
				return false;
			}
			
		}
		// check diagonal left 
	int maxLeft = Math.min(row, col);
	
	for(int i = 1 ;i<=maxLeft ; i++) {
		if(board[row-i][col-i]) {
			return false;
		}
	}
	// Diagonal Right
	int  maxRight = Math.min(row , board.length-col-1);
	 for(int i =1 ; i<=maxRight ; i++) {
		 if(board[row-i][col+i]) {
			 return false;
		 }
	 }
	 return true;
	}
	public static void display(boolean[][]board) {
		//marking as Q which ever box is true ; else x
		for(boolean[] row :board) {
			for(boolean element:row) {
				if(element) {
					System.out.print("Q" + " ");
				}
				else {
					System.out.print("X" + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
