package in.dsa.array.matrix;

public class TransposeMatrix {
	
	 
    public static void main(String[] args) {
        
    	
        // Example 1
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result1 = transpose(matrix1);
        System.out.println("Transpose of matrix1:");
        printMatrix(result1); // Output: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
        
        // Example 2
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        int[][] result2 = transpose(matrix2);
        System.out.println("Transpose of matrix2:");
        printMatrix(result2); // Output: [[1, 4], [2, 5], [3, 6]]
    }
    
   
    
    public static int[][] transpose(int[][] matrix) {
    	
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        
        int[][] result = new int[numCols][numRows];
        
        for(int i = 0; i < numRows; i++) 
        	for(int j = 0; j < numCols; j++) 
                result[j][i] = matrix[i][j];
                
        return result;
    }
    
    // Helper function to print a matrix
    private static void printMatrix(int[][] matrix) {
    
    	for(int[] row : matrix){
            System.out.print("[");
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }
    
    
}
