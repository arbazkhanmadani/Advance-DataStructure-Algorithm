package in.dsa.array.map;

import java.util.*;

public class MissingAndRepeatedNum {


	public static void main(String[] args){

		int[] arr = {-1,0,4,5,1,2,6,2 };

		Map<Integer, Boolean> numberMap = new HashMap<>();

		//if(arr[0]!=1){}

		//Repeating num..........
		for (Integer i : arr) {

			if (numberMap.get(i) == null) {
				//unique values.......
				numberMap.put(i, true);
			}
			else {
				//Repeating values....
				System.out.println("Repeating = " + i);
				//continue;
				numberMap.put(i, false);			}
		}
		
		//Missing num...................
		//{1,2,4,5,6} // check weather map has array's element 
		//Here i = keyOfMap not Index of Array................
		for(int i = 0; i <= numberMap.size(); i++) {
			
			//If get(i) has value return value else null...
			if(numberMap.get(i) == null) {
				System.out.println("Missing = " + i);
				break;
			}
		}
		System.out.println(numberMap);
		

	}
	

}
