package in.dsa.recursion.problems;

public class SumElementOfArray {


	public static void main(String[] args){
		
		int[] a = {1,2,3,4,5};
		int n = a.length;
		int sum = sum(a,n-1);
		System.out.print(sum);
		
	}

	public static int sum(int[] a, int i){

		if(i<0)return 0;
	
		int sum = sum(a, i-1) + a[i];
		return sum;
	}

}
