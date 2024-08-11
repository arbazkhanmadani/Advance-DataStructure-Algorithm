package in.dsa.advance.greedy;

import java.util.HashMap;

public class TaskSchedular{

	public static void main(String[] args){
       
        System.out.println(leastInterval(new char[]{'A','A','A','B','B','B'}, 2));  // Output: 8
        System.out.println(leastInterval(new char[]{'A','A','A','B','B','B'}, 0));  // Output: 6
        System.out.println(leastInterval(new char[]{'A','A','A','B','B','B'}, 1));  // Output: 8
    }
	
	public static int leastInterval(char[] tasks, int n) {

		HashMap<Character, Integer> hm = new HashMap<>();
		int max = 0;
		        
		//Count the frequency of each task
		for(char task : tasks){
		            
			hm.put(task, hm.getOrDefault(task, 0) + 1);
		    max = Math.max(max, hm.get(task));
		
		}
		
		//Calculate the number of tasks with the maximum frequency
		int maxCount = 0;
		for(int count : hm.values())
			if(count == max)
				maxCount++;

		//Formula to calculate task scheduling
		int ans = (max-1)*(n+1);
		ans+=maxCount;

		//if ans<then return length itself.
		return ans>tasks.length ? ans:tasks.length;    
		    
	}
}
