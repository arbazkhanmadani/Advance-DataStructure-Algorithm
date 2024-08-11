package in.dsa.array.matrix;    

public class SumOfDaigonalOfMatrix {


	public static void main(String[] args) {

		int sum = sumOfDiagonal(new int[][]{
											{1,1,1,1},
											{1,1,1,1},
											{1,1,1,1},
											{1,1,1,1}
										   }
		);
		System.out.println("Element fount at idx: "+ sum);
	}
	
	public static int sumOfDiagonal(int[][] a){
		
		int sum = 0, n = a.length-1;
		if(a.length==1)return 0;
			
		for(int i = 0; i<=n; i++){
			for(int j = 0; j<a[i].length; j++){
			    //j == n-1 => for left diagonal                                                                                        
				if( (i==0 && j==0) ||
					(i==n && j==n) ||
					(i==0 && j==n) ||
					(i==n && j==0) ||
					(i==j ) ||
					(j==n-i) ){
					
					sum = sum + a[i][j];
				}
			}
		}
	  return sum;			
	}

	
	//way 2.............................
	public int diagonalSum(int[][] mat){
	        
		int sum=0;    
		for(int i=0;i<mat.length;i++){
	       
			sum+=mat[i][i];
	        if(i!= mat.length - 1 - i)
	           sum+=mat[i][mat.length-1-i];
		}
	        
		return sum;
	}
}
