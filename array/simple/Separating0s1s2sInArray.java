package in.dsa.array.simple;

//Dutch National Flag Algorithm
class Separating0s1s2sInArray {

	public static void main(String[] args){
		
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		sortZerosOnesAndTwos(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	
	}
	
	
	//Sort the array in this form{0, 1, 2}
	static void sortZerosOnesAndTwos(int a[]){
		
		int lo = 0, mid = 0, hi = a.length - 1;
		
		while (mid <= hi) {
			
			switch(a[mid]){
				
				case 0: 
					swap(a, lo, mid);
					lo++;
					mid++;
				break;
				case 1:
					mid++;
				break;
				case 2 : 
					swap(a, mid, hi);
					hi--;
			}	
		}	
	}
	
	
	private static void swap(int[]a, int i, int j){	
		
		int t = a[i];
		a[i]  = a[j];
		a[j]  = t;	
	}
	
	
}
