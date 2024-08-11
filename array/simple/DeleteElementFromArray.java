package in.dsa.array.simple;

import java.util.Arrays;

public class DeleteElementFromArray {

	public static void main(String[] args) {


		int[] arr = deleteElement(new int[]{1,2,3,4,5}, 3);
		System.out.println(Arrays.toString(arr));
		int[] arr1 = removeTheElement(new int[]{1,2,3,4,5}, 2);
		System.out.println(Arrays.toString(arr1));
		
	}
	
	public static int[] deleteElement(int a[], int elm){
		
		for(int i = 0; i<a.length; i++){
			
			//ON THE BASIS OF ELEMENT
			if(a[i]==elm)
				a[i]=0;
			
			/*ON THE BASIS OF INDEX	
			if(i==elm)  -> here elm =index of array
				a[i]=0;
		     */
		
		}
		
		return a;
	}

	
	//Second way..............................................
	public static int[] removeTheElement(int[] arr, int index){
  
        // If the array is empty or the index is not in array range return the original array
        if (arr == null || index < 0 || index >= arr.length)
        	return arr;
        
  
        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];
  
        // Copy the elements except the index from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
  
            // if the index is the removal element index
            if (i == index) 
                continue;
            
  
            // if the index is not the removal element index 
            //k++ = increasing the idx of new array
            anotherArray[k++] = arr[i];
        }
  
        return anotherArray;
    }
	
}
