package in.dsa.array.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTriplateOfIs0{

	public static void main(String[] args){
    	
		int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = findTriplate(nums);
        System.out.println(result);        
    
	}
	 
	
	public static List<List<Integer>> findTriplate(int nums[]){
	        
		// Sort the array to use two-pointer technique
		Arrays.sort(nums);         
		List<List<Integer>> result = new ArrayList<>();
        
		
        for(int i = 0; i < nums.length - 2; i++){
        	
        	if(i > 0 && nums[i] == nums[i - 1]) 
        		continue;//Skip duplicates
            
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            
            while(left < right){
            	
                int sum = nums[left] + nums[right];
                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    
                    // Skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) 
                        left++;
                    
                    while (left < right && nums[right] == nums[right + 1]) 
                        right--;
                    
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        
        return result;

	}
	 
	    
}
