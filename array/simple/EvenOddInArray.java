package in.dsa.array.simple;

public class EvenOddInArray {


	public static void main(String[] args) {

		int a[] = { 1,2,3,5,6,8,7,6,8,5,3};
		evenOdd(a);
	}
 
	

	//Function to find intersection.......
    public static void evenOdd(int[] arr){
 
    	int temp = 0, j = 0;
        for(int i = 0; i < arr.length; i++){
        	
        	if(arr[i]%2!=0){
        		
        		temp = arr[i];
        		arr[i] = arr[j];
        		arr[j] = temp;
        		
        		j++;
        	}
        }
    
    	for(int i = 0; i < arr.length; i++){
    		
    		System.out.print(arr[i]+" ");
    	        
    	}
        
    }
    

}
