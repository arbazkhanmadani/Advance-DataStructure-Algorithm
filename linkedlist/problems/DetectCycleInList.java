package in.dsa.linkedlist.problems;

import java.util.HashMap;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class DetectCycleInList{
	
	public static void main(String[] args){

		LinkedList l = new LinkedList();
		l.addLast(20);
		l.addLast(4);
		l.addLast(15);
		l.addLast(10);
		
		//Create loop for testing.....
		l.head.next.next.next.next = l.head.next.next;
		
		boolean isCycle = isCycle(l.head);
		System.out.println("Is Cycle : "+isCycle);		
		
	}
	
	
	public static boolean isCycle(Node head){
		
		if(head==null)return false;
		
		Node temp = head;
		HashMap<Node, Integer> visited = new HashMap<>();
		
		while(temp!=null){
			
			if(visited.get(temp.next)!=null){
				visited.put(temp.next, visited.getOrDefault(temp.next, 0)+1);
				return true;
			}
			visited.put(temp.next, 1);
			
		  temp = temp.next;
		
		}
		
		return false;
	}
	

}
