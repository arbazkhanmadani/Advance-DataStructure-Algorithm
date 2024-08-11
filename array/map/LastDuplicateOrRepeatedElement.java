package in.dsa.array.map;

import java.util.*;
import java.util.Map.Entry;

public class LastDuplicateOrRepeatedElement {


	public static void main(String[] args) {

		duplicate(new int[] {2,3,5,7,5,7,7,1,1,4,3});
		
	}
	
	public static void duplicate(int[] a){
		
		//if i wont show Generic here then at the time of Entry class i will get error.
		Hashtable<Integer, Boolean> hm = new Hashtable<>();
		//TreeSet<Integer> dup_map = new TreeSet<>();
		
		for(int i =0; i<a.length; i++){
			
			if(hm.get(a[i])==null)
				// false key -> one time(unique) 
				hm.put(a[i], false);
				
			else{				hm.put(a[i],true);
				//dup_map.add(a[i]);
			}
		}
		
		int lastE=0;
	    for(Map.Entry<Integer, Boolean> entry : hm.entrySet())
			//entry.getValue()==false =>one time....
			if(entry.getValue()==true)
			     lastE= entry.getKey();
				    System.out.println("Last Duplicate elements is : "+ lastE);
	    	System.out.println(hm);
	}

}
