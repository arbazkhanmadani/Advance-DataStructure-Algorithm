package in.dsa.array.map;

import java.util.*;

public class UnionOfTwoArray {

	public static void main(String[] args) {

		int a[] = { 11,1, 3, 2, 3,3, 4, 5,5,5, 5, 6 ,5};
		int b[] = { 3,3,3,5,3,3,9,5,5,5,5 };
		
		int[] un = union(a, b);
		for(int ob : un)
			System.out.println(ob);
	}
	
	
	public static int[] union(int a[], int b[]){
		
		Set<Integer> s = new HashSet<>();
		
		for(int i =0; i<a.length; i++){
			s.add(a[i]);
		}
		for(int i =0; i<b.length; i++){
			s.add(b[i]);
		}
		
		List<Integer> l = new ArrayList<>(s);
		int[] arr = new int[s.size()];
		for(int i = 0; i<l.size(); i++){
			arr[i] = l.get(i);
		}
		return arr;
	}
}
