package in.dsa.array.tricky;

/**
=>An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
Given an integer array nums, return true if the given array is monotonic, or false otherwise.

*/
public class MontonicArrray {

	public static void main(String[] args) {
        
		
        int[] nums1 = {1, 2, 2, 3};
        System.out.println("Is monotonic: " + isMonotonic(nums1)); // Output: true
        
        int[] nums2 = {6, 5, 4, 4};
        System.out.println("Is monotonic: " + isMonotonic(nums2)); // Output: true
        
        int[] nums3 = {1, 3, 2};
        System.out.println("Is monotonic: " + isMonotonic(nums3)); // Output: false
    }
	
	
	public static boolean isMonotonic(int[] nums) {

		if(nums.length < 2)
			return true; // An array with fewer than 2 elements is trivially monotonic.
	        

	        // Flags to track whether the array is increasing or decreasing
	        boolean increasing = true;
	        boolean decreasing = true;
	        
	        // Traverse the array to determine monotonicity
	        for(int i = 0; i < nums.length - 1; i++) {
	            
	        	if (nums[i] < nums[i + 1])
	                decreasing = false; // If we find an increase, it's not decreasing
	            
	            if (nums[i] > nums[i + 1]) 
	                increasing = false; // If we find a decrease, it's not increasing
	            
	        }
	        
	        // If either increasing or decreasing is still true, the array is monotonic
	        return increasing || decreasing;
	  
	}
}
