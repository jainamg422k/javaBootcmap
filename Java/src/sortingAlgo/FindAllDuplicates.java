package sortingAlgo;

public class FindAllDuplicates {
    public static int  searchduplicates(int []nums) {
    	int index =0;
    	while(index< nums.length) {
    		if (nums[index]!= index+1) {
    		  if(nums[index]!=nums[nums[index]-1] ){
    			  swap( nums , index  , nums[index]-1);
    		  }
    		  else {
    			  return nums[index];
    		  }
    		}
    		else {
    			index++;
    			
    		}
    	}
    	return -1;
    }
    static void swap(int[]arr , int first , int end ){
	 	   int temp = arr[first];
	 		  arr[first] = arr[end];
	 		  arr[end]= temp;
	 		
	 	}
	public static void main(String[] args) {
          int[] arr = {1,3,4,2,2};
          System.out.println(searchduplicates(arr));
	}

}
