package in.dsa.array.simple;

public class CyclicRotateByTempArray {

	 public static void main(String[] args){
		 rigthRotate(new int[]{10,20,30,40,50,60},2);
		 //4,5,1,2,3	
	 }
	
 	public static void rigthRotate(int[] a, int kTimes){

	       int temp[] = new int[a.length];
	       
	       //temp = {10,20,30,0,0,0}
	       for(int i = 0; i<kTimes; i++)
			          temp[i] = a[i];	
	       
	       //old a = {10,20,30,40,50,60}
	       //new a = {40,50,60,40,50,60}
	       int j = kTimes;
	       for(int i = 0; j < a.length; i++)
				         a[i] = a[j++];
	       
	       //old a = {40,50,60,40,50,60}
	       //new a = {40,50,60,10,20,30}
	       j = 0;
	       for(int i = a.length-kTimes; i < a.length; i++)
				         a[i] = temp[j++];
	       
	  
	        for(int elm : a){
		           System.out.print(elm+" ");
	        }
	    
	    
   }
}
