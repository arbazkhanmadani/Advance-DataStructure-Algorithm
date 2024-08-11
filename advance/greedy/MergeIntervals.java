package in.dsa.advance.greedy;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals{
	
	 public static void main(String[] args) {
	           
	    int[][] intervals2 = { {1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16} };
	    int[] newInterval2 = { 4, 8 };
	    int[][] result2 = insert(intervals2, newInterval2);
	        
	    for(int[] interval : result2)
	       System.out.println("[" + interval[0] + "," + interval[1] + "]");    
	}
	 
	 
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        
    	List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Add all intervals ending before newInterval starts
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i++]);
        }

        // Merge all overlapping intervals with newInterval
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // Add all intervals starting after newInterval ends
        while (i < n) {
            result.add(intervals[i++]);
        }

    
        return result.toArray(new int[result.size()][]);
    }

   
}

