package in.dsa.array.algos;



public class SortArrayDSC {

	public static void main(String[] args) {

		
		int[] sorted_arr = sort(new int[]{1,5,4,7,5,5,5,-1,0,+2});
		
		for(int elm : sorted_arr){
			
			System.out.println(elm);
		}
	}
	
	
	public static int[] sort(int arr[]) {
		
		for(int i = 0; i<arr.length; i++){
			
			for(int j = i+1; j<arr.length; j++){
				
				int temp = 0;
				if(arr[i] <= arr[j]){
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

}
