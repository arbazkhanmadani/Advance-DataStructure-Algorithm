package in.dsa.array.matrix;

/**
 	0 1 1 1
 	0 0 1 1
 	1 1 1 1 
 	
 	2nd row has max 1 so output=2
 **/

public class FindRowWithMaxNumberOf1{

	public static void main(String[] args) {
		int maxRowIdx = rowWithMaxNumOf1(new int[][]{{0,1,1,1},{0,0,1,1},{1,1,1,1} });
		System.out.println(maxRowIdx);
	}
	
	
	public static int rowWithMaxNumOf1(int[][] a){

		int maxOne = 0, count=0, maxCount=0;
		
		for(int i = 0; i<a.length; i++){
			for(int j = 0; j<a[i].length; j++)
				if(a[i][j]==1)
					count++;
			
			if(count>maxCount){
				maxCount = count;
				maxOne = i;
			}
		}
		
		//If there is not a single 1 in matrix.....
		if(maxOne==0)
			return -1;
		return maxOne;
					
	};
	

}
