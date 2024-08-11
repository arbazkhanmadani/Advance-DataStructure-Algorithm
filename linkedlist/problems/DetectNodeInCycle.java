package in.dsa.linkedlist.problems;

import java.util.HashMap;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class DetectNodeInCycle{

	public static void main(String[] args){

		LinkedList l = new LinkedList();
		l.addLast(20);
		l.addLast(4);
		l.addLast(15);
		l.addLast(10);
		
		System.out.println("Is Cycle : "+l.head.next.next.data);		
		
		//Create loop for testing.....means last(10) next has 15's address.
		l.head.next.next.next.next = l.head.next.next;
		
		Node cycleNode = isCycle(l.head);
		System.out.println("Is Cycle : "+cycleNode.data);		
		
		
	}
	
	
	public static Node isCycle(Node head){
		
		if(head==null)return null;
		
		Node temp = head;
		HashMap<Node, Integer> visited = new HashMap<>();
		
		while(temp!=null){
			
			
			if(visited.get(temp.next)!=null){
					
				visited.put(temp.next, visited.getOrDefault(temp.next, 0)+1 );
				System.out.println(visited);
				
				return temp.next;
			}
			visited.put(temp.next, 1);
			temp = temp.next;
			
		}
		
		return null;
	}

}
