package in.dsa.array.map;

import java.util.HashMap;

public class OneArrayIsSubsetOfSecond {

	 public static void main(String[] args){
	        
		 int[] arr1 = { 11, 1, 13, 21, 3, 7 };
	     int[] arr2 = {11,3,7, 1 };
	 
	     if (isSubset(arr1,arr2))
	            System.out.println("arr2[] is subset of arr1[] ");
	        else
	            System.out.println("arr2[] is not a subset of arr1[] ");
	 }
	 
	 
	 
	 
	 public static boolean isSubset(int[] arr1, int[] arr2){

		 HashMap<Integer, Boolean> frequency = new HashMap<>();
		 	
		 //Putting true for element.........
		 for(int i = 0; i < arr1.length; i++)
			 frequency.put(arr1[i], true);
		 
		 System.out.println(frequency);
		 
		 System.out.println(frequency.get(arr2[2]));
		 boolean flag = false;
		 
		 //comparing elm of arr2 with map[arr1] if present then true else false. 
		 for(int i = 0; i < arr2.length; i++){
			 
			  if(frequency.get(arr2[i])!=null)
				  flag = true;
			  else{
				  flag = false;
				  break;
			  }
		 }
		 
		 return flag;
	 }
	 
	 
}

