package in.dsa.array.simple;


public class LowestElement {

	public static void main(String[] args) {
		
		int min_elm = lowestElement(new int[]{2,1,-1,4,32,32,22,32,7});
		System.out.println(min_elm);
	}
	
	
	public static int lowestElement(int arr[]){
		
		int low = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length; i++)
			if(arr[i]<low)
				low = arr[i];
		
		return low;
	}
	
	
	
}
