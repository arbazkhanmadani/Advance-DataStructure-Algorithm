package in.dsa.array.simple;

public class SquareOfSortedArrray {

	public static void main(String[] args) {

		int[] squares = squareArray(new int[]{-4, -1, 0, 3, 10});
		for(int square : squares){
			System.out.print(square+" ");
		}
	}
	
	public static int[] squareArray(int[] sortedArray){
	        
		int[] result = new int[sortedArray.length];
	        
	    int left = 0;
	    int right = sortedArray.length-1;
	    int index = sortedArray.length-1;
	           
	    while (left<=right){
	            
	    	int leftSquare = sortedArray[left]*sortedArray[left];
	        int rightSquare = sortedArray[right]*sortedArray[right];
	            
	         if(leftSquare>rightSquare){
	             result[index--] = leftSquare;
	             left++;
	         } 
	         else{
	             result[index--] = rightSquare;
	             right--;
	         }   
	    }
	        
	    return result;   	
	}

}
