package in.dsa.array.simple;

public class PrefixSumOfArray {

	public static void main(String[] args){
		
		int a[] = prefixSum(new int[]{1,2,3,4,5});
		
		for(int e : a)System.out.println(e);
	}
	

	public static int[] prefixSum(int[]a){
	
		int prefixSum = 0;
		int[] ps = new int[a.length];
		
		for(int i =0; i<a.length;i++){
			
			prefixSum = prefixSum+a[i];
			ps[i] = prefixSum;
		}
		
		return ps;
	}
}
