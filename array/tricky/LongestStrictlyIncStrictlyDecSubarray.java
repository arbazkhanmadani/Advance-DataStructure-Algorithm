package in.dsa.array.tricky;

public class LongestStrictlyIncStrictlyDecSubarray{
	
    
	public static void main(String[] args) {
        
        int[] nums1 = {1, 4, 3, 3, 2};
        System.out.println("Longest subarray length: " +longestSubarray(nums1)); // Output: 2
        
        int[] nums2 = {3, 3, 3, 3};
        System.out.println("Longest subarray length: " + longestSubarray(nums2)); // Output: 1
        
        int[] nums3 = {3, 2, 1};
        System.out.println("Longest subarray length: " + longestSubarray(nums3)); // Output: 3
    }
    
    
	
    public static int longestSubarray(int[] nums) {
        
    	if (nums.length == 0) return 0;

        int maxLength = 1;
        int incLength = 1; // Length of current increasing subarray
        int decLength = 1; // Length of current decreasing subarray

        
        for(int i = 0; i < nums.length-1; i++) {
            
        	if(nums[i] < nums[i + 1]){
                // Current element is greater than previous, increase incLength
                incLength++;
                // Reset decLength
                decLength = 1;
            }
        	else if(nums[i] > nums[i + 1]){
                // Current element is smaller than previous, increase decLength
                decLength++;
                // Reset incLength
                incLength = 1;
            }
        	else {
                // Current element is equal to previous, reset both lengths
                incLength = 1;
                decLength = 1;
            }

            // Update maximum length found
            maxLength = Math.max(maxLength, Math.max(incLength, decLength));
        }

        return maxLength;
    }


}
