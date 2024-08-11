package in.dsa.array.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;

public class DuplicateInAnArrayUsingHashMap {

	public static void main(String[] args) {

		duplicate(new int[] {3,0,3,1,1,2,1});
		
	}
	
	public static void duplicate(int[] a){
		
		// if i wont show Generic here then at the time of Entry class i will get error.
		HashMap<Integer, Boolean> hm = new HashMap<>();
		for(int i =0; i<a.length; i++){
			
			if(!hm.containsKey(a[i]))
				//false key -> one time(unique) 
				hm.put(a[i], false);
		
			else {
				//1st way -> Repeating values....
				System.out.println("Repeating = " + a[i]);
				//true key -> many times(duplicate)
				hm.put(a[i], true);
				//continue;
				
			}
		 }
		
		
		System.out.println(hm.toString());
		//2nd way.........................
		for(Entry<Integer, Boolean> entry : hm.entrySet() ){
			
			//entry.getValue()==false =>one time....
			if(entry.getValue()==true){
				System.out.println("Duplicate elements are : "+ entry.getKey());
			}
		}

	}
}
