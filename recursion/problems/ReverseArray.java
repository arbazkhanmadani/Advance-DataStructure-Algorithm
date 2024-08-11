package in.dsa.recursion.problems;

public class ReverseArray {

	public static void main(String[] args){
		
		int[] a = {1,2,3,4,5};
		int n = a.length;
		reverse(a,0,n-1);
		
		for(int e : a) System.out.print(e+" ");
	}

	public static void reverse(int[] a, int i, int j){

		if(i==a.length-1)return;
	
		int temp = 0;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		reverse(a, i+1, j-1);
	}

}
