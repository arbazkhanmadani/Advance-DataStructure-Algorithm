package in.dsa.array.simple;

import java.util.HashSet;

public class SumOfDuplateIs0 {

	public static void main(String[] args) {

	     int A[] = { 1, 4, 3, 6, 10,-3 ,8};
	     int target = 0;
	     sumOfDuplateIs0(A, target);
	}
	
	public static void sumOfDuplateIs0(int[]a, int t){
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int e : a){
			
			int target = -e;
			
			if(hs.contains(target))
				System.out.println("Target element are : "+e+" : "+target);
			else
				hs.add(e);
		}
		
		System.out.println("There is no Target element.");
		
	}

}
