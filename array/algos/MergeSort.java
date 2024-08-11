package in.dsa.array.algos;

public class MergeSort{

	public static void main(String[] args){
        
		int[] arr = { 10, 7, 8, 9, 1, 5 };
	    int N = arr.length;
	 
	    sort(arr, 0, N - 1);   
	    System.out.println("Sorted array:");
	    for(int i = 0; i < arr.length; i++)
	        System.out.print(arr[i] + " ");
	}
	
	
	
	public static void sort(int[] arr, int i, int j){
		
		if(i < j){
			
            // Find the middle point
            int mid = (i + j) / 2;

            //Recursively sort the first and second halves
            //1st half
            sort(arr, i, mid);
            //2nd half
            sort(arr, mid + 1, j);

            // Merge the sorted halves
            merge(arr, i, mid, j);
        }
	}
	
	

	private static void merge(int[] array, int left, int middle, int right) {
        
		// Find sizes of two sub arrays to be merged
		//middle - left + 1 => 
		int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays manually
        for(int i = 0; i < n1; i++){
            leftArray[i] = array[left + i];
        }
        for(int j = 0; j < n2; j++){
            rightArray[j] = array[middle + j + 1];
        }

        // Merge the temporary arrays back into the original array

        int i = 0; // Initial index of first subarray
        int j = 0; // Initial index of second subarray
        int k = left; // Initial index of merged subarray

        while (i < n1 && j < n2){
        	//for descending we only reverse the condition. >=
            if (leftArray[i] <= rightArray[j])
                array[k++] = leftArray[i++];
            else 
                array[k++] = rightArray[j++];
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1)
            array[k++] = leftArray[i++];
         

        // Copy remaining elements of rightArray[] if any
        while (j < n2)
            array[k++] = rightArray[j++];
         
    }
	
}
