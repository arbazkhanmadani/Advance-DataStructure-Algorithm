package in.dsa.array.matrix;


public class TraverseMatrixBy1Loop {

	public static void main(String[] args){
		print(new int[][]{ {1,2,3},{4,5,6},{7,8,9} });
	}

	
	public static void print(int[][]a){
		
		int row = a.length;
		int col = a[0].length;
		
		for(int i = 0; i<row*col; i++){
			
			int r = i/row;
			int c = i%col;
			System.out.print(a[r][c]+" ");
			
			if(c==row-1)System.out.println();
		}
	
	}
}
