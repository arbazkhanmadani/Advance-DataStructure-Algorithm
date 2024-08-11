package in.dsa.array.simple;
import java.util.Arrays;

/**
Given the array nums consisting of 2n elements in the form 
[x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form
[x1,y1,x2,y2,...,xn,yn].
*/
public class SuffleArray{

    public static void main(String[] args) {
        
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        int[] result1 = rearrangeArray(nums1, n1);
        System.out.println("Rearranged array: " + Arrays.toString(result1)); // Output: [2, 3, 5, 4, 1, 7]
        
        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        int[] result2 = rearrangeArray(nums2, n2);
        System.out.println("Rearranged array: " + Arrays.toString(result2)); // Output: [1, 4, 2, 3, 3, 2, 4, 1]
        
        int[] nums3 = {1, 1, 2, 2};
        int n3 = 2;
        int[] result3 = rearrangeArray(nums3, n3);
        System.out.println("Rearranged array: " + Arrays.toString(result3)); // Output: [1, 2, 1, 2]
    }

	
    public static int[] rearrangeArray(int[] nums, int n) {
        
    	int[] result = new int[2 * n]; // Create an array of size 2n
        
    	int xI = 0; // Pointer for the first half
        int yI = n; // Pointer for the second half
        
        for(int i = 0; i<2*n; i+=2){
            
        	result[i] = nums[xI++]; // Assign from the first half
            result[i + 1] = nums[yI++]; // Assign from the second half
            
        }
        
        return result;
    }
    
}
