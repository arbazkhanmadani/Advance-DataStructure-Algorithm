package in.dsa.array.tricky;

//Wave array ->{10, 70, 50, 20, 30, 60, 40}
public class CreateWaveArray {

	 public static void main(String args[]){
	        
		 int arr[] = {10, 70, 50, 20, 30, 60, 0};
	     sortInWave(arr);
	        
	     for(int i : arr)
	         System.out.print(i+" ");
	     
	 }
	 
	 
	 public static void sortInWave(int arr[]){
		 
	     //i = i+2 -> Traversing all even elements
		 for(int i = 0; i <= arr.length-1; i = i+2){
	       
	    	 int temp = 0;
	    	 //swap odd and even positions.....
	         if(i > 0 && arr[i - 1] > arr[i]){
	        	 
	        	 temp = arr[i];
	             arr[i] = arr[i-1];
	             arr[i-1] = temp;
	         } 
	         if(i< arr.length-1 && arr[i + 1] > arr[i]){
	         	
	        	 temp = arr[i];
		         arr[i] = arr[i+1];
		         arr[i+1] = temp;
		     }
	    }
	     
	     
	}
	     
	     
}
