package in.dsa.linkedlist.problems;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class DeleteAllGivenDuplicate {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.addLast(30);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(30);
		ll.addLast(0);
		
		Node newHead = deleteNode(ll.head,30);
		
		while(newHead!=null){
			System.out.print(newHead.data+" ");
		newHead = newHead.next;
		}	
	}
		
		
	public static Node deleteNode(Node head, int val){
	         
		while(head != null && head.data == val) 
	        head = head.next;
	    
	    
	    Node prev = null;
	    Node current = head;
	    
	    while(current!=null){
	    	
	    
	        if(current.data == val){
	            // Remove current node
	            if(prev != null) 
	                prev.next = current.next;    
	        } 
	        else
	           // Move prev forward
	           prev = current;
	        
	        
	       // Move current forward
	       current = current.next;
	    }
	    
	    
	    return head;
	    
	}	

}
