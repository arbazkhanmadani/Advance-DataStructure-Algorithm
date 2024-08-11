package in.dsa.array.map;

import java.util.Map;
import java.util.TreeMap;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] count = countPairOfSum(new int[]{1,2,3,4,5,6,7,8,9}, 10);
		for(int e : count)System.out.println(e);
	}

	
	public static int[] countPairOfSum(int[] a, int target ){
		
		int count = 0;
		Map<Integer, Integer> m = new TreeMap<>();
		int[] sum = new int[2];
		
		for(int i = 0; i<a.length; i++){
			
			int complement = target - a[i];
			
			if(m.containsKey(complement)){
				sum[0] = m.get(complement);
				sum[1] = i;
				/* For counting pairs.................
				 *m.put(a[i], m.get(a[i]+1));
				 *count = count + m.get(complement);
				*/
			}
			else
				m.put(a[i], 1); 
		}
		
		return sum;
	}
	
}
