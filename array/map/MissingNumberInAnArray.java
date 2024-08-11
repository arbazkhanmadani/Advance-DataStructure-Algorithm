package in.dsa.array.map;

import java.util.Arrays;

//Using Using summation of first N natural numbers method....
public class MissingNumberInAnArray {

	public static void main(String[] args) {

		//here in  this series "4" is missing.........
		int a[] = {-1,1,3,2,4,5};
		Arrays.sort(a);
		
		missingNumber(a);
		
		int num = missingNumberByBinarySearch(a);
		System.out.println("missing number by BINARY SEARCH: "+num);
		
	}
	
	
	public static void missingNumber(int[] ar){
		
		
		//BY LINEAR SEARCH................ 
		//sum of n number = ( n*(n+1) )/2;
		//              n         *        n+1          /2
		int n = ar.length-1;
		int sum = ( ar[n]*(ar[n]+1) )/2;
		int arrSum = 0;
		
		for(int i = 0; i<ar.length;i++){
			arrSum = arrSum+ar[i];
		}
		
		int missingNum = sum - arrSum;
		System.out.println("sum of n number : "+sum);
		System.out.println("sum of array number : "+arrSum);
		System.out.println("missing number by LINEAR SEARCH : "+missingNum);
		
		
		
	    
	}
	//BY BINARY SEARCH................ 
	public static int missingNumberByBinarySearch(int[] ar){
	
		int low = 0, high = ar.length- 1;
	    int mid;
	    
		//For 0th Elm..(it means 1 is missing in sorted array)
		if (ar[0] != 1)
	        return 1;
		//For Nth Elm......(it means nth elm is missing in sorted array)
	    if (ar[ar.length- 1]!= (ar.length + 1) )
	        return ar.length + 1;
	    
	    while ( (high - low) > 1 ) {
	        
	    	mid = (low+high) / 2;
	    	//{1,2,3,5}
	        if ((ar[low] - low) == (ar[mid] - mid) )
	            low = mid+1;
	       
	        else if ( (ar[high] - high) == (ar[mid] - mid) )
	            high = mid-1;

   
	    }
	
	    return (ar[low]+1);
	
	}
}
