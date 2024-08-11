package in.dsa.array.algos;

//Definition => repeatedly swap 2 adjacent elements if they are in wrong order
//				until the whole are gets sorted.

public class SortArrayASC {

	public static void main(String[] args) {

		double sTime = System.nanoTime();
		int[] sorted_arr = sort(new int[]{1,5,4,7,5,5,5,-1,0,2});
		double eTime = System.nanoTime()-sTime;
		System.out.println(eTime);
		for(int elm : sorted_arr){
			
			System.out.println(elm);
		}
	}
	
	//Bubble Sort
	public static int[] sort(int arr[]) {
		
		for(int i = 0; i<arr.length; i++){
			
			for(int j = i+1; j<arr.length; j++){
				
				int temp = 0;
				if(arr[i] > arr[j]){
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

}
