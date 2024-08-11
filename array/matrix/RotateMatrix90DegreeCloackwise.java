package in.dsa.array.matrix;

public class RotateMatrix90DegreeCloackwise{

	public static void main(String[] args){
		
		int[][] a = { {1,2,3},{4,5,6},{7,8,9} };
		
		for(int i = 0; i<a.length; i++){
			for(int j = 0; j<a[i].length; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("================");
		rotate(a);
		
		for(int i = 0; i<a.length; i++){
			for(int j = 0; j<a[i].length; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	
	}
	
	
	public static void rotate(int[][]a){
		
		int n = a.length;
		
		//Transposing Matrix
		for(int i = 0; i<n; i++){
			//j=i=>for excluding already swapped.
			for(int j = i; j<n; j++){
				
				int temp = a[i][j];
				a[i][j] =  a[j][i];
				a[j][i] = temp;
			}	
		} 
		
		//Rotate matrix
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n/2; j++){
				//swap element in row.
				int temp = a[i][j];
				a[i][j] = a[i][n-j-1];
				a[i][n-j-1] = temp;
			}	
		}
		
	}
	
	
}

