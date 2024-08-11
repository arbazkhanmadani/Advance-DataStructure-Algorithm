package in.dsa.linkedlist.problems;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class MiddleOfLinkedListDelete {

	public static void main(String[] args){

		LinkedList l = new LinkedList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(5);
		l.addLast(6);
		
		Node temp = l.head;
		while(temp!=null){
			System.out.print(temp.data+" ");
		temp = temp.next;
		}
		System.out.println();
		
		Node mid1 = middleOfListInOnePass(l.head);
		
		while(mid1!=null){
			System.out.print(mid1.data+" ");
		 mid1 = mid1.next;
		}
	}


	public static Node middleOfListInOnePass(Node head){
		
		if(head == null || head.next==null) 
            return head;
        

        Node slow = head;
        Node fast = head;
        
        //Dor getting left middle -> fast.next.next.next!=null && fast.next.next.next.next!= null.
        //fast.next.next.next!= null -> bcx we want one node before middle.
        while(fast.next.next!=null && fast.next.next.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
       //slow=3 slow.next=5 slow.next.next=5 -> 1 2 3 4 5 6 => 4=mid => 1 2 3 5 6
       slow.next = slow.next.next; 
       return head;
	}

}
