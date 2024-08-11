package in.dsa.array.simple;

import java.util.*;
public class KthLargestElement{

	public static void main(String[] args) {

		int k = 2;
		kthLargestElement(new int[]{1,3,8,10,8,5,8,10,1,6,4,11,11}, k);
		//1,2,4,5,6,8,8,8,10,10,11
	}
	
	//Kth largest element means where k = 2; which means 2nd largest element
	//if k = 4; 4th largest element 
	public static void kthLargestElement(int nums[], int k){
		
		//This is for 3rd Smallest Element............................................
		//PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		 PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
	        
	        // Insert elements into the max heap
	        for(int num : nums){
	        	
	            if(!maxHeap.contains(num)){
	                maxHeap.add(num);
	                
	                // Maintain heap size to k
	                if (maxHeap.size() > k)
	                    maxHeap.poll(); // Remove the smallest element (maintain only top 3)
	            }
	            
	        }
	        
	        //If heap size is less than 3, return the maximum element
	       //Otherwise, return the third maximum element
	       
	        
	        System.out.println(maxHeap.peek()); // The third max or just the max
	        
	}
	
	
}



