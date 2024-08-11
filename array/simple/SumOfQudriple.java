package in.dsa.array.simple;

import java.util.*;

public class SumOfQudriple{
	
	 public static void main(String[] args) {
	        
	        // Example 1
	        int[] nums1 = {1, 0, -1, 0, -2, 2};
	        int target1 = 0;
	        List<List<Integer>> result1 = fourSum(nums1, target1);
	        System.out.println("Quadruplets for example 1: " + result1);
	        
	        // Example 2
	        int[] nums2 = {2, 2, 2, 2, 2};
	        int target2 = 8;
	        List<List<Integer>> result2 = fourSum(nums2, target2);
	        System.out.println("Quadruplets for example 2: " + result2);
	        
	}
	 
	 
	 public static List<List<Integer>> fourSum(int[] nums, int target) {
	      
		 Arrays.sort(nums); // Sort the array
	     
		 Set<List<Integer>> result = new HashSet<>();
	     
		 int n = nums.length;
	        
	        for (int i = 0; i < n - 3; i++) {
	            // Skip duplicate values for the first element
	            if (i > 0 && nums[i] == nums[i - 1]) continue;
	            
	            for (int j = i + 1; j < n - 2; j++) {
	                // Skip duplicate values for the second element
	                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
	                
	                int left = j + 1;
	                int right = n - 1;
	                
	                while (left < right) {
	                   
	                	long sum = (long) nums[i] + nums[j] + nums[left] + nums[right]; // Use long to avoid overflow
	                    
	                    if (sum == target) {
	                        // Add the valid quadruplet to the result
	                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
	                        left++;
	                        right--;
	                        // Skip duplicate values for the third element
	                        while (left < right && nums[left] == nums[left - 1]) left++;
	                        // Skip duplicate values for the fourth element
	                        while (left < right && nums[right] == nums[right + 1]) right--;
	                    } else if (sum < target) {
	                        left++;
	                    } else {
	                        right--;
	                    }
	                }
	            }
	        }
	        
	       
	        return new ArrayList<>(result);
	    
	    }
}

