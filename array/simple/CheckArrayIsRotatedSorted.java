package in.dsa.array.simple;

public class CheckArrayIsRotatedSorted {

	
	public static void main(String[] args){
    
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Is valid rotation? " + check(nums1)); // Output: true
        
        int[] nums2 = {2, 1, 3, 4};
        System.out.println("Is valid rotation? " + check(nums2)); // Output: false
        
        int[] nums3 = {1, 2, 3};
        System.out.println("Is valid rotation? " + check(nums3)); // Output: true
    
	}
	
	
	 public static boolean check(int[] nums){
	        
		 if (nums.length == 0) return true;
	     if (nums.length == 1) return true;

	     int count = 0;
	     int n = nums.length;
	     
	     //3, 4, 5, 1, 2
	     //Traverse the array and count the number of breaks
	     for(int i = 0; i < n; i++) 
	    	 /*nums[(i + 1) % n]:
			  This refers to the next element in the array, where n is the length of the array.
			  The modulo operation (i + 1) % n ensures that if i + 1 exceeds the last index of the arr(n - 1)
			  it wraps around to the start of the array. This handles the circular nature of the array.
			 */
	    	 if(nums[i]>nums[(i+1)%n]) 
	    		 count++;
	            
	     // If there is more than one break, return false
	     //bcz there is only one point where next element will be smaller then ith or not in case of sorted.
	     //3, 4, "5,>1", 2
	     return count <= 1;
	    
	 }
   
}
