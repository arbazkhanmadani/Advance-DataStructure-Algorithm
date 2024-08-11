package in.dsa.array.simple;

public class SerachInRotatedSortedArray {

	  public static void main(String[] args) {
	 
		  int[] nums = {4, 5, 6, 7, 0, 1, 2}; // Example input
	      int target = 1;
	      int result = search(nums, target);
	      System.out.println("Index of target " + target + ": " + result);
	 }
	
	 public static int search(int[] nums, int target) {

	       	int left = 0;
	        int right = nums.length - 1;
	        
	        while (left <= right) {
	            
	        	int mid = left + (right - left) / 2;
	            
	            if (nums[mid] == target) 
	                return mid;
	            
	            // Determine which side is properly sorted
	            else if(nums[left] <= nums[mid]){
	                // Left side is sorted
	                if(nums[left] <= target && nums[mid] > target) 
	                    right = mid - 1;
	                else
	                    left = mid + 1;
	            }
	            else {
	                // Right side is sorted
	                if(nums[right] >= target && nums[mid] < target ) 
	                    right = mid - 1;
	                else 
	                	left = mid + 1;
	                
	            }
	        }
	        
	        return -1; // Target not found
	    
	    }
}
