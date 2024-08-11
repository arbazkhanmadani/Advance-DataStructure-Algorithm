package in.dsa.array.simple;

import java.util.HashMap;

//Majority Element =>  Occurrence of Element > array.length/2 
public class MajorityElement {

	 public static void main(String[] args){
	 
	        int arr[] = {2,2,4,1,1,2,2};
	        findMajority(arr);
	        findMajorityByHashMap(arr);
	 }
	 

	 public static void findMajority(int arr[]){
	        
		 int count = 0;
	     int majority = 0;
	        
	     for(int a : arr){
	    	 
	    	 if(count==0)
	    		 majority = a;
	         count+= (majority==a) ? 1 : -1;  
	         System.out.println("a : "+a+" count : "+count );
	         
	     }
	     
	   System.out.println(majority);
	 }


	 
	 public static void findMajorityByHashMap(int arr[]){
	        
		 HashMap<Integer, Integer> hm = new HashMap<>();
		    
		 for(int i = 0; i<arr.length; i++){
	         if(hm.containsKey(arr[i]))
	            hm.put(arr[i], hm.get(arr[i])+1 );
	         else
	        	 hm.put(arr[i], 1);
		 }
		 
		 hm.forEach((k,v)->{
	    	  if(v>arr.length/2) System.out.println("The majority element is : "+k);
	     }); 
	 }
	 
	     
}
