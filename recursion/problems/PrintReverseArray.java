package in.dsa.recursion.problems;

public class PrintReverseArray {

	public static void main(String[] args){
		
		int[] a = {1,2,3,4,5};
		int n = a.length;
		reverse(a,0,n-1);
	}

	public static void reverse(int[] a, int i, int j){

		if(i==a.length)return;
	
		System.out.print(a[j]+" ");
		reverse(a, i+1, j-1);
		
		//System.out.print(a[j]+" "); -> print non-reverse.
		
	}

}
