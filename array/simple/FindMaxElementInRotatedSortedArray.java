package in.dsa.array.simple;

public class FindMaxElementInRotatedSortedArray {

public static void main(String[] args){
		
		int arr[] = {5, 6, 2, 3, 4};
		System.out.println("The max element is "+ findMax(arr));
	}

	
	public static int findMax(int []nums){
	
		 if (nums.length == 0) return 0;
	     if (nums.length == 1) return nums[0];

	     int max = 0;
	     int n = nums.length;
	     
	     //3, 4, 5, 1, 2
	     for(int i = 0; i < n; i++) 
	    	 /*nums[(i + 1) % n]:
			  This refers to the next element in the array, where n is the length of the array.
			  The modulo operation (i + 1) % n ensures that if i + 1 exceeds the last index of the arr(n - 1)
			  it wraps around to the start of the array. This handles the circular nature of the array.
			 */
	    	 if(nums[i]>nums[(i+1)%n]) 
	    		max=nums[i];
	     // If there is more than one break, return false
	     //bcz there is only one point where next element will be smaller then ith or not in case of sorted.
	     //3, 4, "5,>1", 2
	     return max;

	}

}
