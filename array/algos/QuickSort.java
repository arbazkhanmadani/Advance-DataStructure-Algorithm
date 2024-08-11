package in.dsa.array.algos;

public class QuickSort{

	public static void main(String[] args){
	        
		int[] arr = {10, 7, 8,8,8, 9, 1, 5};
	    int N = arr.length;
	 
	    sort(arr, 0, N - 1);   
	    System.out.println("Sorted array:");
	    for(int i = 0; i < arr.length; i++)
	        System.out.print(arr[i] + " ");
	}
 
	
	// The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // i --> Starting index,
    // j --> Ending index
    static void sort(int[] arr, int i, int j){

    	if (i < j) {
 
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, i, j);
 
            // Separately sort elements before
            // partition and after partition
            sort(arr,i, pi-1);
            sort(arr, pi+1, j);
        }
    	
    }
    

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] arr, int low, int high){
        
    	// Choosing the pivot
        int pivot = arr[high];
 
        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++){
 
            // If current element is smaller than the pivot
        	//for descending we only reverse the condition. >=
        	if(arr[j] <= pivot){
 
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        
        }
        
        swap(arr, i + 1, high);
        return (i + 1);
    }
 

	 
	// A utility function to swap two elements
    static void swap(int[] arr, int i, int j){
        
    	int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
     
    
 }
