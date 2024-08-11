package in.dsa.array.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElementInConstantSpace {

	public static void main(String[] args) {
		
		int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates1 = findDuplicates(nums1);
        System.out.println(duplicates1); 
        
	}

	public static List<Integer> findDuplicates(int[] nums) {
	       
	       List<Integer> mylist = new ArrayList<>();
	       Arrays.sort(nums);

	       for(int i=0;i<nums.length-1;i++)
	    	   if(nums[i]==nums[i+1])
	    		   mylist.add(nums[i]);
	                  
	  return mylist;        
	}
}
