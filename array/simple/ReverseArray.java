package in.dsa.array.simple;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {


		reverseAnArray(new int[]{1,2,3,4,4,5});
	}
	
	public static void reverseAnArray(int a[]){
		
		int low = 0, high = a.length-1, temp;
		
		while(low<high){
			
			temp = a[high];
			a[high] = a[low];
			a[low] = temp;
			
		 low++;
		 high--;
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
