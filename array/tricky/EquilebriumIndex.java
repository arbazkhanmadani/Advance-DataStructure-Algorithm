package in.dsa.array.tricky;

/*
For the array {-7, 1, 5, 2, -4, 3, 0}, the equilibrium index is found at index 3, 
where array[3] = 2, and the sum of elements to the left (-7 + 1 + 5)=-1 equals the
sum of elements to the right (-4 + 3 + 0)=-1. Therefore, the output will be: 3rd idx.
*/
public class EquilebriumIndex{

	public static void main(String[] args){

		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
		int equiIdx  = findEquilibriumIndices(arr);
		System.out.println("The Equilebrium Index is : "+equiIdx);
	} 
	

	public static int findEquilibriumIndices(int[] arr){
	        
		if(arr==null || arr.length==0){
			System.out.println("No equilibrium index found.");
	            return -1;
	    }
	    
		
		int equiIdx = -1;
	    int leftSum = 0;
        int rightSum = 0;
        int i=0,j=arr.length-1;
        
        while(i<j){
           
        	leftSum+=arr[i];
        	rightSum+=arr[j];
        	
        	if(leftSum == rightSum)
        	   equiIdx = i+1;   
        	
         i++;
         j--;
        }
        
        
	        
	    return equiIdx;
	 }
}
