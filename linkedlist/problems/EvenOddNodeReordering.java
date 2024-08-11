package in.dsa.linkedlist.problems;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class EvenOddNodeReordering {

	public static void main(String[] args){

		LinkedList l = new LinkedList();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.addLast(40);
		l.addLast(50);
		l.addLast(60);
		
		Node evenOddHead = evenOdd(l.head);
		while(evenOddHead!=null){
			System.out.print(evenOddHead.data+" ");		
			evenOddHead = evenOddHead.next;	
		}
	}
	

	public static Node evenOdd(Node head){
		
		 if(head == null || head.next == null) 
	        return head;
	        

	     //Initialize pointers for odd and even lists
	       
		 Node oddNode = new Node(0); // Dummy head for odd list
		 Node evenNode = new Node(0); // Dummy head for even list
		 
		 Node oddHead = oddNode;
	     Node evenHead = evenNode;
	     Node current = head;
	     
	     //Id isOdd = false -> even come first.
	     boolean isOdd = true;

	     while(current!=null){
	            
	    	 if(isOdd){
	    		 oddHead.next = current; // Append to odd list
	            //head maintaining
	    		 oddHead = oddHead.next;
	         }
	    	 else{
	    		 evenHead.next = current; // Append to even list
	    		 evenHead = evenHead.next;
	         }
	            
	    	 current = current.next;
	         isOdd = !isOdd;//Toggle between odd and even
	       
	     }

	        
	     //End the even list
	     evenHead.next = null;
	     // Connect the end of the odd list to the head of the even list
	     oddHead.next = evenNode.next;

	     return oddNode.next; // The head of the new list with odd and even nodes
	}


}
