package in.dsa.linkedlist.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class RemoveDuplicatesKeepOnlyOneOccurance {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		
		l.addLast(1);
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(3);
		
		Node headNode = deleteDuplicates(l.head);
		while(headNode!=null){
			System.out.print(headNode.data+" ");
		  headNode = headNode.next;
		}
	}
	
	
	public static Node deleteDuplicates(Node head){

		if(head == null) 
            return head;
        

        //HashSet to keep track of seen values
        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;//To keep track of the previous node

        while(current!=null) {
            
        	if(seen.contains(current.data))
                //Skip the current node as it's a duplicate
                prev.next = current.next;
            
                // Add the value to the HashSet 
                seen.add(current.data);
                //update prev pointer with current
                prev = current;
            
            current = current.next;
        }

        return head;
	}

}
