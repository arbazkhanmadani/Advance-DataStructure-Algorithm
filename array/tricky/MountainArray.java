package in.dsa.array.tricky;

public class MountainArray {

	public static void main(String[] args) {
     
		int[] arr1 = {2, 1};
        System.out.println("Is valid mountain array: " + validMountainArray(arr1)); // Output: false
        
        int[] arr2 = {3, 5, 5};
        System.out.println("Is valid mountain array: " + validMountainArray(arr2)); // Output: false
        
        int[] arr3 = {1, 3, 2};
        System.out.println("Is valid mountain array: " + validMountainArray(arr3)); // Output: true
        
        int[] arr4 = {0, 3, 2, 1};
        System.out.println("Is valid mountain array: " + validMountainArray(arr4)); // Output: true
    }
	
	
	 public static boolean validMountainArray(int[] arr) {
	        
		 int n = arr.length-1;
	        
	     // Check for valid length
	     if(arr.length < 3)
	    	 return false;
	        
	     
	     int i = 0;
	     // Check for increasing sequence
	     while(i < n && arr[i] < arr[i + 1]) 
	    	 i++;
	        
	        
	     // Peak cannot be the first or last element
	     if(i == 0 || i == n)
	    	 return false;
	        
	        
	     // Check for decreasing sequence
	     while(i < n && arr[i] > arr[i + 1]) 
	    	 i++;
	        
	        
	    //If we have traversed the entire array, it's a valid mountain array
	    return i == n;
	    
	 }
	  
	     
}
