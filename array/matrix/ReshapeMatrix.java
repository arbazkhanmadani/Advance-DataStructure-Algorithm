package in.dsa.array.matrix;

public class ReshapeMatrix{
	
	public static void main(String[] args) {
	        
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6}
				};
		
		int r = 3, c = 2;
		
	    System.out.println("before...............");
		for(int[] row : matrix){
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
	    }
		
		int[][] result = matrixReshape(matrix, r, c);
	    
	    System.out.println("After................");
	    for(int[] row : result){
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
	    }
    }
	 
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
	        
    	int n = mat.length;
	    int m = mat[0].length;
	        
	    // Check if reshape is possible else return same matrix
	    if(m * n != r * c)
	         return mat;
	        
	    int[][] reshaped = new int[r][c];
	    int[] flat = new int[m * n];
	          
	    //Flatten the original matrix
	    int index = 0;
	    for(int i = 0; i < n; i++)
	        for(int j = 0; j < m; j++)
	            flat[index++] = mat[i][j];
	     
	        
	    //Fill the reshaped matrix
	    index = 0;
	    for(int i = 0; i < r; i++) 
	        for(int j = 0; j < c; j++) 
	            reshaped[i][j] = flat[index++];
	        
	 
	    return reshaped;
    }
	    
	    
}
