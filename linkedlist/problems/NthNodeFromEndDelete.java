package in.dsa.linkedlist.problems;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class NthNodeFromEndDelete{

	public static void main(String[] args){

		LinkedList l = new LinkedList();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.addLast(40);
		l.addLast(50);
		l.addLast(60);
		l.addLast(70);
		l.addLast(80);
		l.addLast(90);
		
		Node newHead = nthNode(l.head, 2);
		
		while(newHead!=null){
			System.out.print(newHead.data+" ");		
			newHead = newHead.next;	
		}
	}

	
	public static Node nthNode(Node head, int n){
		
		if(head==null ) return head;
		
		Node slow = head;
		Node fast = head;
		
		//moving fast to nth from beginning...
		for(int i = 0; i<n; i++)
			fast = fast.next;
		
		System.out.println(fast.data);
		while(fast.next!=null){
			slow = slow.next;
			fast = fast.next;
		}
		
		//last 2nd's.next overwrite = +2 node's address.
		slow.next = slow.next.next;
		
		
		return head;
	}

}