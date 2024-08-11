package in.dsa.array.simple;

public class MaxProductInAnArray {

	 public static void main(String[] args) {
	      
	      int arr[] = { 10, 2, 3, -5, 99, 0, -1,12 };
	      maxProduct(arr);
	 }
	 
	 public static void maxProduct(int arr[]){
	      
		 int first = arr[0], second = arr[0];
	     int idx1 = -1, idx2 = -1;
	     
	      // For loop to iterate the elements from 1 to n
	      // to find the first largest element
	      for (int i = 0; i < arr.length; i++) {
	        
	         // If array element is larger than current largest element, then swap
	         if (arr[i] > first){
	            first = arr[i];
	         	idx1 = i;
	         }
	         // For loop to iterate the elements from 1 to n to find the second largest element
		     // If array element is larger than current largest element and not equals to
	         // largest element, then swap
	         if (arr[i] > second && arr[i] != first){
		            second = arr[i];
		         	idx2 = i;
		      	}
	      }
	      
	      System.out.println("Largest product = " + (first * second));
	      System.out.println("The elements are " + first + " and " + second+ " at index "+idx1 + " and "+idx2+" respectively.");
	
	 
	 }
	 
}
