package in.dsa.array.simple;


public class MinimumSwapToSortArray {

	public static void main(String[] args) {

		// Test cases
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(minShiftsToSort(nums1)); //Expected Output: 2

        int[] nums2 = {1, 3, 5};
        System.out.println(minShiftsToSort(nums2)); //Expected Output: 0

        int[] nums3 = {2, 1, 4};
        System.out.println(minShiftsToSort(nums3)); //Expected Output:-1
    }
	
	
	public static int minShiftsToSort(int[] nums){
	        
		 int n = nums.length;
	     //Step 1: Check if the array is already sorted
	     if(isSorted(nums)) 
	    	  return 0;
	        
	     //Step 2: Try all possible right shifts
	     for(int i = 1; i < n; i++){
	            
	    	 //Rotate the array to the right by one position
	         int[] rotatedArray = rotateRight(nums, i);

	         //Check if rotated array is sorted
	         if(isSorted(rotatedArray)) 
	        	 return i; 
	     }
	      
	      
	     // Step 3: Return -1 if no valid rotation sorts the array
	     return -1;
	 }

	 
	 private static boolean isSorted(int[] nums){
		 for(int i=0; i<nums.length-1; i++)
			 if(nums[i]>nums[i+1]) 
				 return false;
	   return true;
	 }
	 
	 private static int[] rotateRight(int[] nums, int k){
		 int n = nums.length;
	     int[] rotatedArray = new int[n];
	     for(int i = 0; i < n; i++)
	    	 rotatedArray[ (i+k)%n ] = nums[i];
	  
	   return rotatedArray;
	 }

}
