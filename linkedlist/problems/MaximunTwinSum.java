package in.dsa.linkedlist.problems;

import java.util.ArrayList;

import in.dsa.linkedlist.problems.LinkedList.Node;

//Twin x0-xn, x1-xn-1 etc...
public class MaximunTwinSum {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(2);
		l.addLast(3);
		int maxSum = pairSum(l.head);
		System.out.println(maxSum);
	}

	  
	public static int pairSum(Node head) {
	      
	  ArrayList<Integer> al = new ArrayList<>();	
	  Node temp = head;	
	  
	  while(temp!=null){
		  al.add(temp.data);
		temp = temp.next;  
	  }  
	
	  int maxSum = 0;
	  int sum = 0;
	  int i = 0, j = al.size()-1;
	  
	  while(i<=j){
		  
		  sum = al.get(i)+al.get(j);
		  maxSum = Math.max(maxSum, sum);
	   
	   i++;
	   j--;	  
	  }
	 return maxSum;    
	}
}
