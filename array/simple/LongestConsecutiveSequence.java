package in.dsa.array.simple;
import java.util.Arrays;

public class LongestConsecutiveSequence{


    public static void main(String[] args){
    	
        int[] arr = {100, 4, 200, 1, 3, 2};
        //Output = 4 => {1,2,3,4}
        System.out.println("Longest consecutive sequence length: " + longestConsecutiveSequence(arr));
    }
    
    
    public static int longestConsecutiveSequence(int[] nums) {
        
    	if (nums == null || nums.length == 0) {
            return 0;
        }
        
    	//Sort the array
        //{100, 4, 200, 1, 3, 2}
        //{1, 2, 3,3 ,3,4, 3,100, 200}
        Arrays.sort(nums);
        
        int maxLength = 1;
        
        for(int i = 1; i < nums.length; i++) 
            if(nums[i] == nums[i - 1] + 1)
            	maxLength++;
        
        
        return maxLength;
    }
    

}
