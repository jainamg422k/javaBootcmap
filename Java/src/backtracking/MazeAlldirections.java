package backtracking;

import java.util.Arrays;

public class MazeAlldirections {

	public static void main(String[] args) {
		 boolean [][] board = {
				 {true, true , true}, 
				 {true , true, true},
				 {true , true , true}
		 };
		System.out.println("Path restrictions maze is ");
		int[][] path = new int[board.length][board[0].length];
		  
    pathAllDirections(" ", board, 0, 0);
    AllPathPrint(" ", board, 0, 0 , path , 1);

	}
	public static void pathAllDirections(String p , boolean[][]maze , int r , int c) {
		if(r == maze.length-1  && c== maze[0].length-1) {
		
			System.out.println(p);
			return;
		}
		
		//for restrictions or obstacles
		if(!maze[r][c]) {
			return ;
		}
		
		maze[r][ c] = false;
		if(r<maze.length-1) {
		 	pathAllDirections(p+'D', maze, r+1 ,c);
		}
		if(c<maze[0].length-1) {
			pathAllDirections(p+'R', maze, r, c+1);
		}
		if(r>0) {
			pathAllDirections(p+'U', maze, r-1 ,c);
		}
		if(c>0) {
			pathAllDirections(p+'l', maze, r ,c-1);
		}
		
		//This line is where the function will over 
	//so before the function gets removed ,also remove the changes that were made by that function
		
		maze[r][c]= true;
	}
	
	
//Path print with steps
	
	public static void AllPathPrint(String p , boolean[][]maze , int r , int c , int[][]path , int steps) {
		if(r == maze.length-1  && c== maze[0].length-1) {
			path[r][c]=steps;
	 for(int[] arr:path) {
		System.out.println(Arrays.toString(arr));		
			}
			System.out.println(p);
			return;
		}
		
		//for restrictions or obstacles
		if(!maze[r][c]) {
			return ;
		}
		
		maze[r][ c] = false;
		path[r][c]=steps;
		if(r<maze.length-1) {
		 	AllPathPrint(p+'D', maze, r+1 ,c ,path ,  steps+1);
		}
		if(c<maze[0].length-1) {
			AllPathPrint(p+'R', maze, r, c+1,path ,  steps+1);
		}
		if(r>0) {
			AllPathPrint(p+'U', maze, r-1 ,c,path ,  steps+1);
		}
		if(c>0) {
			AllPathPrint(p+'l', maze, r ,c-1,path ,  steps+1);
		}
		
		//This line is where the function will over 
	//so before the function gets removed ,also remove the changes that were made by that function
		//Backtrack
		maze[r][c]= true;
		 path[r][c]= 0;
		 
	}

}
