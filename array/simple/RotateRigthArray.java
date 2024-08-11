package in.dsa.array.simple;


public class RotateRigthArray{

	public static void main(String[] args){

		rigthRotate(new int[]{1,2,3,4,5},2);
		//4,5,1,2,3	
	
	}


	public static void rigthRotate(int[] a, int kTimes){

		for(int i = 0; i<kTimes; i++){
	
	       int last = a[a.length-1];
	       for(int j = a.length-2; j>=0; j--)
	    	   a[j+1] = a[j];	
	       
		a[0] = last;
	}	

	for(int elm : a){
		System.out.print(elm+" ");
	}
}


}