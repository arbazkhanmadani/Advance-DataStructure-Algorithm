package in.dsa.linkedlist.problems;

import java.util.HashSet;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class IntersectionOfTwoList {


	public static void main(String[] args){

		LinkedList l = new LinkedList();
		l.addLast(4);
		l.addLast(1);
		l.addLast(8);
		l.addLast(4);
		l.addLast(5);
		
		LinkedList l1 = new LinkedList();
		l1.addLast(5);
		l1.addLast(6);
		l1.addLast(1);
		l1.addLast(8);
		l1.addLast(4);
		l1.addLast(5);
		
		//testing => Creating a Intersection point L's (1) intersecting to L2's (1).
		l.head.next = l1.head.next.next;
		
		System.out.println("Intersection : "+getIntersectionNode(l.head, l1.head).data);		
		System.out.println("Intersection : "+intersectonByHashSet(l.head, l1.head).data);		
		
	}


	 public static Node getIntersectionNode(Node headA, Node headB){
	        
		 if(headA == null || headB == null)
	            return null;
	        

	        // Compute the length of both lists
	        int lengthA = getLength(headA);
	        int lengthB = getLength(headB);

	        // Align the start of both lists
	        if(lengthA > lengthB) 
	            headA = advanceBy(headA, lengthA - lengthB);
	        else 
	            headB = advanceBy(headB, lengthB - lengthA);
	        

	        // Traverse both lists to find the intersection
	        while(headA != null && headB != null){
	            
	        	if(headA == headB)
	                return headA;
	            
	            headA = headA.next;
	            headB = headB.next;
	        }

	        return null;
	    }

	    // Helper function to compute the length of a list
	    private static int getLength(Node head) {
	        
	    	int length = 0;
	        while(head != null){
	            length++;
	          head = head.next;
	        }
	        
	        return length;
	    }

	    // Helper function to advance the pointer by n steps
	    private static Node advanceBy(Node head, int n){
	        
	    	while(n>0 && head!=null){
	            head = head.next;
	            n--;
	        }
	    	
	        return head;
	    }


	    
	    //Second Approach - By HASHSET..................................
	    public static Node intersectonByHashSet(Node headA, Node headB){
	    	
	    	if(headA==null || headB==null)return null;
	    	
	    	HashSet<Node> seen = new HashSet<>();
	    	
	    	Node temp = headA;
	    	while(temp.next!=null){
	    	
	    		//l.head.next = l1.head.next.next;
	    		if(seen.contains(headB.next))
	    			return headB.next;
	    		
	    		seen.add(temp.next);
	    		
	    		temp = temp.next;
	    		headB = headB.next; 
	    	}
	    	
	    	return null;
	    }
	    
}
