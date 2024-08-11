package in.dsa.zloop.logical2;

/**
Given a positive integer n, find the pivot integer x such that:
The sum of all elements between 1 and x inclusively equals the
sum of all elements between x and n inclusively.

Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
*/

public class PivotElement{

	 
	public static void main(String[] args){
	
		int pivot  = pivotIndex(4);
		System.out.println(pivot);
	}	
	
	public static int pivotIndex(int n){
	        
		 double p = (int)Math.sqrt(n*(n+1)/2);
		 return (p == (int)p) ? (int)p : -1;
	 }
}
