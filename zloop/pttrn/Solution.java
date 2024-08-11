package in.dsa.zloop.pttrn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Solution{

	public static void main(String[] args){
      
		System.out.println(findMaxK(new int[]{-1,10,6,7,-7,1}));
		System.out.println(findMaxK(new int[] {-9,-43,24,-23,-16,-30,-38,-30}));
		
	}
	
	

	public static int findMaxK(int[] nums) {
        
        HashMap<Integer, Integer> hm = new LinkedHashMap<>(); 

        for(int e : nums){

            int t = Math.abs(e);
            
            hm.put(e, hm.getOrDefault(t,0)+1 );
        }

        System.out.println(hm);
        int last = -1;
        for(int ent : hm.values()){

            //if(ent==2)
               // last = Math.abs(ent.getKey());
        }

        return last;
    }

}
