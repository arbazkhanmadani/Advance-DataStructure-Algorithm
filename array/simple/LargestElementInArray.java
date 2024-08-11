package in.dsa.array.simple;


public class LargestElementInArray {

	public static void main(String[] args){
		
		int max_elm = largestElement(new int[]{2,1,4,32,32,22,32,7});
			System.out.println(max_elm);
	
	}
	
	
	public static int largestElement(int arr[]){
		
		int largest = arr[0];
		for(int i = 0; i<arr.length; i++){
			
			//For lowest elm => arr[i]<largest...
			if(arr[i]>largest)
				largest = arr[i];
		}
		
		return largest;
	}

}
