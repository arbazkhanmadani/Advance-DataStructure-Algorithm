package in.dsa.array.matrix;

import java.util.Arrays;
import java.util.HashSet;

public class FlatMatrix {

	public static void main(String[] args) {

		int[][] matrix = {
            {3,6},
            {1,5},
            {4,7}
        };

        int[] flattened = flattenMatrix(matrix);

        // Print the flattened array
        System.out.println(Arrays.toString(flattened));
        
    	int[][] matrix1 = {
                {1,3},
                {5,8}
            };

            int[] flattened1 = flattenMatrix(matrix1);

            // Print the flattened array
            System.out.println(Arrays.toString(flattened1));
        
    }
	
	
	  public static int[] flattenMatrix(int[][] matrix) {
	      
		  //Sorting a 2D Array.........................................
		  //Integer Array
		  //Arrays.sort(matrix, (a, b) ->  Integer.compare(a[0], b[0]));
		  //String Array
		  //Arrays.sort(matrix, (a, b) -> a[1].compareTo(b[1]));

		  int rows = matrix.length;
	      int cols = matrix[0].length;
	      int[] flattenedArray = new int[rows * cols];
	      int index = 0;

	      for(int i = 0; i < rows; i++)
	    	  for(int j = 0; j < cols; j++)
	                flattenedArray[index++] = matrix[i][j];
	      
	      
	      return flattenedArray;
	  }
}
