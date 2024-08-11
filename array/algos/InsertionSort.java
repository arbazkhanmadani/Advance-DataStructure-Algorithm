package in.dsa.array.algos;

//Definition => Inserting an element from unsorted array to correct position in sorted array
//				until the whole are gets sorted.

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] a = {1,5,4,7,5,5,5,-1,0,2};
		double sTime = System.nanoTime();
		int[] sorted_arr = insertionSort(a);
		double eTime = System.nanoTime()-sTime;
		System.out.println(eTime);
		
		for(int elm : sorted_arr){
			
			System.out.println(elm);
		}
		
	}
	
	public static int[] insertionSort(int a[]){
     
		//1,5,4,7,5,5,5,0
		for(int i = 1; i<a.length; i++) {
			
			int j , elm = a[i];
			for(j = i-1; j>=0 && a[j]>elm ; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = elm;
			//System.out.println("j : "+j+" : a[j+1] : "+a[j+1]);
		}
		
		
		return a;
	}

}
