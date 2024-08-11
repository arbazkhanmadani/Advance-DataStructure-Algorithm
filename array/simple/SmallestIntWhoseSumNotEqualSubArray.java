package in.dsa.array.simple;

import java.util.Arrays;

/*
 *  {1,10,3,11,6,5}
 *  smallestint = 2
 *  It means arr does not contain a num whose sum=any subset of array.
 */
public class SmallestIntWhoseSumNotEqualSubArray {

	public static void main(String[] args) {
		int smallestInt = smallestIntWHoseSumNotEqualSubarray(new int[]{1,2,10,3,6,5});
		System.out.println(smallestInt);
	}

	public static int smallestIntWHoseSumNotEqualSubarray (int[] a){
		
		//initialize Result....1,2,3,5,6,10,11
		// sum = 1-> bcz we need sum of array +1 so that sum of array not equal to it since array self==subarray 
		int sum = 1;
		for(int i = 0; i<a.length; i++)
			sum = sum+a[i];
		
		return sum;
		
	}	
}
