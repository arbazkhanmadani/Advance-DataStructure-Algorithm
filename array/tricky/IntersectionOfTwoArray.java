package in.dsa.array.tricky;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {

		int a[] = { 1,3,2,3,3,4,5,5,5,5,6,5};
		int b[] = { 3,3,3,5,3,3,9,5,5,5,5,11 };
		
		intersection(a,b);
	}
 
	
	//Function to find intersection............
    static void intersection(int[] a, int[] b){
 
       	HashSet<Integer> hs = new HashSet<>();
    	HashSet<Integer> hs1 = new HashSet<>();
    	
    	for(int i : a) hs.add(i);
    	for(int i : b)if(hs.contains(i)) hs1.add(i);
    	
    	
    	//System.out.println(hs);
    	System.out.println(hs1);
    	
    }


}
