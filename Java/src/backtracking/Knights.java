package backtracking;

public class Knights {

	public static void main(String[] args) {

		int n = 4;
		boolean [][] board = new boolean[n][n];
	knight(board , 0 , 0 ,n);
		
	

	}
	static void  knight(boolean[][] board , int row , int col , int knights) {
		 // base conditon 
		if(knights== 0) {
			display(board);
			return;
		}
		 //if we go out of found in matrix just skip
		 if(row == board.length -1 && col== board.length) {
			 return;
		 }
		//if we reach to end of the column check for the new row 
		 if(col==board.length) {
				 knight(board , row+1 , 0 , knights);
				 return;
	}

		 if(isSafe(board,row,col)) {
			 board[row][col] =true;
			 knight(board, row, col+1, knights-1);
			 board[row][col] =false;
		 }
		
		 //knight is not safe just move ahead do not reduce the knight
		 knight(board, row, col+1, knights);
	}
	public static boolean isSafe(boolean[][] board , int row , int col) {
		if(isValid(board , row-2 , col-1)) {
			if(board[row-2][col-1]) {
				return false;
			}
		}
			if(isValid(board , row-2 , col+1)) {
				if(board[row-2 ][col+1]) {
					return false;
				}
			}
				if(isValid(board , row-1 , col+2)) {
					if(board[row-1 ][col+2]) {
						return false;
					}
				}
					if(isValid(board , row-1 , col-2)) {
						if(board[row-1 ][col-2]) {
							return false;
						}
			
		}
					return true;
	}
	
	// checking if the row  and col is valid or not 
	static boolean isValid(boolean[][]board , int row , int col ) {
		if(row>=0  && row <board.length  && col>=0 && col<board.length) {
			return true;
		} 
		return false;
	}
	public static void display(boolean[][]board) {
		//marking as Q which ever box is true ; else x
		for(boolean[] row :board) {
			for(boolean element:row) {
				if(element) {
					System.out.print("K" + " ");
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
