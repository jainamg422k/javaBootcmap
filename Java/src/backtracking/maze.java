package backtracking;

import java.util.ArrayList;

public class maze {

	public static void main(String[] args) {
		 int count  = pathCount(3, 3);
		 System.out.println(count);
		 printPath( " ", 3, 3);
		 
		 System.out.println(PathRet(" " , 3  ,3));
		 System.out.println(pathDiagonal(" " , 3,3));
		 
		 boolean [][] maze = {
				 {true, true , true}, 
				 {true , false, true},
				 {true , true , true}
		 };
		System.out.println("Path restrictions maze is ");
		pathRestrictions(" ", maze, 0, 0);
		  
		 

	}
	// Counting number of paths  to reach source to destination
	public static int pathCount(int r , int c) {
		if(r==1 || c==1) {
			return 1;
		}
		
	  int down  = pathCount(r-1, c);
	  int rigth= pathCount(r, c-1);
	  return down+rigth;
	}
	//Printing Path in Place
	public static void printPath(String p  , int r , int c ) {
        if(r==1 && c==1) {   //base condition  if both row and col are equal print path;
        	System.out.println(p);
        	return;
        }
        
        if(r>1) {
        	printPath(p+'D', r-1, c);     // go down until object is last row
        }
        if(c>1) {
        	printPath(p+'R', r, c-1);     //  go Right  until object is last column;
        }
	}
  
	//Returning the ArrayList<>
	public static ArrayList<String>  PathRet(String p  , int r , int c ) {
        if(r==1 && c==1) {   //base condition  if both row and col are equal print path;
        ArrayList<String> ls = new ArrayList<String>();
        ls.add(p);
        	return ls;
        }
        ArrayList<String>  ans = new ArrayList<String>();
        
        if(r>1) {
           ans.addAll(	PathRet(p+'D', r-1, c));     // go down until object is last row
        }
        if(c>1) {
        	ans.addAll(PathRet(p+'R', r, c-1));     //  go Right  until object is last column;
        }
        return ans;
	}
	
	
	//we can move object in Diagonal also
		public static ArrayList<String>  pathDiagonal(String p  , int r , int c ) {
	        if(r==1 && c==1) {   //base condition  if both row and col are equal print path;
	        ArrayList<String> ls = new ArrayList<String>();
	        ls.add(p);
	        	return ls;
	        }
	        ArrayList<String>  ans = new ArrayList<String>();
	        
	        if(r>1 && c>1) {
	        	ans.addAll(pathDiagonal(p+'D' , r-1 , c-1));    //Digonal
	        }
	        if(r>1) {
	           ans.addAll(	pathDiagonal(p+'V', r-1, c));      //Vertical  // go down until object is last row 
	        }
	        if(c>1) {
	        	ans.addAll(pathDiagonal(p+'H', r, c-1));     //Horizontal //  go Right  until object is last column;
	        }
	        return ans;
		}
		
	//Obstactes in maze or restrictions in any  row cols in matrix
		public static void pathRestrictions(String p  ,boolean[][]maze, int r , int c ) {
	        if(r== maze.length-1 && c== maze[0].length-1) {   //base condition  if both row and col are equal print path;
	        	System.out.println(p);
	        	return;
	        }
	        if(!maze[r][c] ) {  // if obstacles found false  just return from their .
	        	
	        	//maze[r][c] == false;
	        	return ;
	        }
	        
	        if(r<maze.length-1) {
	        	pathRestrictions(p+'D',maze, r+1, c);     // go down until object is last row
	        }
	        if(c<maze[0].length-1) {
	        	pathRestrictions(p+'R',maze, r, c+1);     //  go Right  until object is last column;
	        }
		}
		
		
}
