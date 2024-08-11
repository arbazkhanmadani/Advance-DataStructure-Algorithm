package in.dsa.array.simple;

//Maximum sum of sub array..............
//KADANE'S ALGORITHM....................
/*
Using the Kaden's algorithm, 
we should consider only the positive elements of the array 
and keep track of only the maximum contiguous sum subarray.
*/
public class LargestSumOfContinousSubArray{

	public static void main(String[] args){
		
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }
	
 
    public static int maxSubArraySum(int a[]){
    	
        //maxSoFar -> hold the maximum sum seen so far.
    	//Integer.MIN_VALUE -> bcz we hafta handle -ve number also.
    	int maxSum = Integer.MIN_VALUE;
    	//maxEndingHere -> hold maximum sum ending at the current position.
    	int currSum = 0;
    	
        for (int i = 0; i < a.length; i++){
        	
            currSum = currSum + a[i];
            
            if(currSum>maxSum)
            	maxSum=currSum;
            
            //Discarding -ve sum....
            if(currSum<0)
            	currSum=0;
        }
        
        return maxSum;
    }   
	   
}
