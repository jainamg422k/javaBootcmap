package searching;

public class SmallestLetter {

	public static void main(String[] args) {
      char [] ch = {'c' , 'f' , 'j'};
      char [] ch1 = {'a', 'b'};
      char target = 'z';
      System.out.println(smallestLetter(ch, target));
      System.out.println(smallestLetter(ch1, target));
	}
    public static char  smallestLetter(char []letters , int target) {
    	int s = 0;
    	int e = letters.length;
    	if(target >= letters[letters.length-1]) {
    		return letters[0];
    	}
    	 while (s<=e) {
    		 int mid = (s+e)/2;
    		 if(letters[mid]== target) {
    			  return letters[mid+1];
    		 }
    			else if(letters[mid]< target)  {
    				s = mid +1;
    			}
    			else {
    				e = mid-1;
    			}
    			 
    		 }
    	  return letters[s];
    	 }
    }

