package in.dsa.array.simple;
import java.util.Arrays;

public class SmallestPositiveMissingNumber {


	public static void main(String[] args){
		
		int arr[] = {0,1,2,10, -10, -20 };
		int ans1 = firstMissingPositive(arr);
		System.out.println("Smallest positive missing number is : "+ans1+" : By LS");
		
	}
	
	
	
	//By Using Linear Search........................
	public static int firstMissingPositive(int[] nums){
		 
		 Arrays.sort(nums);
		 //{0,1,2,10, -10, -20 }
		 
		 int missNum = 0;
		 for (int i = 0; i < nums.length; i++){
			 
			 //nums[i]==missNum -> Checks the availability of num in array.
			 if(nums[i] == missNum)
				 missNum++;
		}
		 
		 return missNum;
	}
	
	
	}
