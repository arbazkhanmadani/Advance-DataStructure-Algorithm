package in.dsa.array.simple;

public class SepratingNegPos {

	public static void main(String[] args) {

		NegPos(new int[]{1,-1,-3,5,-6,-0,-5,1,1,1,1,-23,3,3,-5,5});
	}
	
	public static void NegPos(int arr[]){
		
		int temp =0;
		
		for(int i = 0,j = 0; i<arr.length; i++){
			
			//-1 -3 -6 -5 -23 -5 5 1 1 1 1 1 3 3 0 5 
			if(arr[i]<0){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			
			
		
		}
		
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	

}

