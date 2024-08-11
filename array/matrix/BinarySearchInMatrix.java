package in.dsa.array.matrix;

import java.util.Arrays;

public class BinarySearchInMatrix {

	public static void main(String[] args) {

		int[] idx = binarySearch(new int[][]{ {1,2,3},{4,5,6},{7,8,9} }, 71);
		
		for(int i = 0; i<idx.length; i++)
			System.out.println("Element fount at idx: "+ Arrays.toString(idx));
	}
	
	
	public static int[] binarySearch(int[][] a, int target){
		
		int row = 0, col = a[row].length-1;
		if(a.length==1)
			return new int[]{0,0};
			
		while(row<a.length && col>=0){
			
			if(a[row][col]==target)
				return new int[]{row, col};
			
			else if(a[row][col]<target)
				row++;
			else
				col--;
		}
		
		return new int[]{-1,-1};
	}

}
