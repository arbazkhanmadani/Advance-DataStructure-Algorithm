package in.dsa.array.tricky;

//Longest Alternating Subsequence
public class LAS {


    public static void main(String[] args){
    	
        int[] arr = { 10, 22, 9, 33, 30, 6, 31, 60 };
 
        System.out.println(LAS(arr));
    }


	 //Longest Alternating Subsequence -> It means,
     //A Sequence in which x1 > x2 < x3 > x4 < x5 [2 > 1 < 4 > 3 < 5] 
     //A Sequence in which x1 < x2 > x3 < x4 > x5 [2 < 4 > 3 < 6 > 5] 
     // Simply it means -> small < big > small < big > small < big
	 public static int LAS(int[] arr){
	 
		 //"inc" and "dec" initialized as 1, as single element is still LAS
	     int inc = 1;
	     int dec = 1;
	 
	     // { 10, 22, 9, 33, 30, 49, 31, 60 }
	     // Iterate from second element
	     for (int i = 1; i <arr.length; i++) {
	 
	         if (arr[i] > arr[i - 1]) {
	                
	        	 //"inc" changes if "dec" changes
	             inc = dec + 1;
	         }
	         else if (arr[i] < arr[i - 1]) {
	 
	             // "dec" changes if "inc" changes
	             dec = inc + 1;
	         }
	      }
	 
	        
	     // Return the maximum length of alternating numbers
	     return (inc>dec) ? inc : dec ;
	    }
	 
}
