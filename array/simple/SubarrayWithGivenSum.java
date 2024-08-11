package in.dsa.array.simple;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
			
		
		subArrayWithGivenSum(new int[]{1,4,3, 20, 10,5}, 33);
	}
	
	public static void subArrayWithGivenSum(int[] a, int sum){
		
		int checkSum;
				
		for(int i =0; i<a.length-1; i++){
			
			//checkSum = a[i]; -> if a single elm = sum then this...
			checkSum = a[i];
			if(checkSum==sum){
				System.out.println("Sum is found at index : "+i);
			}
			
			else {
				for(int j = i+1; j<=a.length-1;j++){
					
					checkSum = checkSum+a[j];
					if(checkSum==sum)
						System.out.println("Sum is found between index : "+a[i]+" and "+a[j]);
				}
			}
			
		}
		
	}

}
