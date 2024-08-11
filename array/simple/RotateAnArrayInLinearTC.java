package in.dsa.array.simple;

public class RotateAnArrayInLinearTC {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		rotate(a, 3);
		for(int e : a)System.out.print(e+" ");
		
	}

	
	//Rotate...........................................
	public static void rotate(int[] a, int k){
	
		int n = a.length;
		k = k%n;
		if(k==0)return;
		
		//Reverse Entire Array -> {7,6,5,4,3,2,1}
		reverse(a, 0, n-1);
		
		//Reverse First K Element -> {5,6,7,4,3,2,1}
		reverse(a, 0, k-1);
				
		//Reverse The Remaining K-n Element -> {5,6,7,1,2,3,4}
		reverse(a, k, n-1);
						
	}
	//Helper...................................
	public static void reverse(int a[], int low, int high){
				
		int temp=0;
		while(low<high){
			
			temp = a[high];
			a[high] = a[low];
			a[low] = temp;
			
			low++;
			high--;
		}
	}
	
	
}
