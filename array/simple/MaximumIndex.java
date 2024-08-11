package in.dsa.array.simple;

/*
 *  maxIdx = j-i   =>  a[i]<a[j] 
 *  {9,2,3,4,5,6,7,8,18,0}
 *  i = 0, j=8  =>  difference = 8(maxIdx)
 *  
 *  It means that => Elm at j must be greater than elm at i a[i]<a[j]
 *  so that difference is max. 
 */
public class MaximumIndex {

	public static void main(String[] args) {

		int maxIdx = maxIndex(new int[]{9,2,3,4,5,6,7,8,18,0});
		System.out.println(maxIdx);
	}

	public static int maxIndex(int[] a){
		
		int maxDiff = Integer.MIN_VALUE;
		for(int i = 0; i<a.length; i++){
			
			for(int j = a.length-1; j>=0; j--){
				
				if(a[i]<a[j] && maxDiff< (j-i) )
					maxDiff = j-i;
			}
		}
		
		return maxDiff;
		
	}	
}
