package in.dsa.array.simple;

import java.util.Arrays;

public class CyclicRotateAnArrayBy1 {

	public static void main(String[] args) {

		int[] arr = cyclicRotateBy1(new int[]{1,2,3,4,5}, 1);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] cyclicRotateBy1(int a[], int rot_count){
		
		//Rotation for 1(only using single loop)................
		//Right Cyclic rotate......
	    int last = a[a.length-1];
	    for(int j = a.length-2; j>=0; j--){
	    	 a[j+1] = a[j];	
	    }
	    a[0] = last;

		return a;
	}
	
}
