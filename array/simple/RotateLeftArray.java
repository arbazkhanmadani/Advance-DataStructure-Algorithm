package in.dsa.array.simple;

public class RotateLeftArray {

	public static void main(String[] args){

		leftRotate(new int[]{1,2,3,4,5},2);
		//3,4,5,1,2
	}


	public static void leftRotate(int[] a, int kTimes){
	
		for(int i = 0; i<kTimes; i++){
		
		       int first = a[0];
		       for(int j = 1; j<a.length; j++){

				a[j-1] = a[j];	
			}
			a[a.length-1] = first;
		}	

		for(int elm : a){
			System.out.println(elm);
		}


	}
}
