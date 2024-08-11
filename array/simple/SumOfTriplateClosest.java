package in.dsa.array.simple;

import java.util.Arrays;

public class SumOfTriplateClosest {

	public int threeSumClosest(int[] nums, int target) {
   
		// Sort the array
		Arrays.sort(nums);
		int n = nums.length;
		int closestSum = Integer.MAX_VALUE;

    
		for(int i = 0; i < n - 2; i++) {
        
			int left = i + 1;
			int right = n - 1;

        
			while(left < right){
            
				// Calculate the current sum of the three numbers
				int currentSum = nums[i] + nums[left] + nums[right];
            
				// Check if this sum is closer to the target than the previous closest sum
				if(Math.abs(currentSum - target) < Math.abs(closestSum - target)) 
					closestSum = currentSum;
            
				// Move pointers based on the comparison of currentSum and target
				if(currentSum < target) 
					left++;
                else if(currentSum > target) 
                	right--;
                else 
                	// Exact match found
                	return currentSum;
			
			}
		}

    
		return closestSum;

	}
}



