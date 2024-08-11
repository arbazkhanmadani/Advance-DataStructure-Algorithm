package in.dsa.linkedlist.problems;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class MiddleOfLinkedList{

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
		
		int mid = middle(l.head);
		System.out.println("Middle of LinkedList : "+mid);		
		
		Node mid1 = middleOfListInOnePass(l.head);
		System.out.println("Middle of LinkedList by one pass : "+mid1);		
		
	}


	public static Node middleOfListInOnePass(Node head){
		
		if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
	}
	
	
	
	public static int middle(Node head){
		
		if(head==null)return -1;
		
		Node temp = head;
		int len = getLength(head);
		
		if(len%2!=0)
			for(int i=0; i<len/2; i++)
				temp = temp.next;
		else
			for(int i=0; i<len/2; i++)
				temp = temp.next;
		
		//left middle => len/2-1.	
		//right middle => len/2.	
		
		return temp.data;
	}
	
	
	//utility...............................
	private static int getLength(Node head){
		
		int count = 0;
		Node temp = head;
		while(temp!=null){
			count++;
			temp = temp.next;
		}
		return count;
	}
}
