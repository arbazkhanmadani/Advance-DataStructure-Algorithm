package in.dsa.array.matrix;

import java.util.ArrayList;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {

		int mul[][] = mulOfMatrix(new int[][]{ {1,2,3},{4,5,6},{7,8,9}}, new int[][]{ {1,2,3},{4,5,6},{7,8,9}});
		for(int i = 0; i<mul.length; i++){
			for(int j = 0; j<mul[i].length; j++)
				System.out.print(mul[i][j]+"  ");
				
			System.out.println();
		}
		
	}
	
	public static int[][] mulOfMatrix(int[][] a, int[][] b){
		
		int[][] mul = new int[a.length][b.length];
		
		for(int i = 0; i<a.length; i++){
			for(int j = 0; j<a[i].length; j++){
				
				mul[i][j] = 0;
				for(int k = 0; k<a[i].length; k++)
					mul[i][j] = mul[i][j] + (a[i][k] * b[k][j]);
			}
		}
		
	  return mul;			
	}

}
