package in.dsa.linkedlist.problems;

import java.util.HashMap;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class DetectLengthOfCycle {

	public static void main(String[] args){

		LinkedList l = new LinkedList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(15);
		l.addLast(4);
		l.addLast(13);
		l.addLast(6);
		l.addLast(7);
		l.addLast(8);
		l.addLast(9);
		
		
		//Create loop for testing.....means last(9) next has 15's address.
		l.head.next.next.next = l.head.next.next.next.next.next.next.next.next.next;
		
		int lengthOfLoop = lengthOfCycle(l.head);
		System.out.println("length of cycle : "+lengthOfLoop);		
		
		
	}
	
	
	public static int lengthOfCycle(Node head){
		
		if(head==null)return 0;
		
		Node slow = head;
		Node fast = head;
		
		while(slow!=null && fast.next!=null){
			
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
				//Return Loop length TotaLength - NoLoopLength = LoopLength
				return getlength(slow, fast);
		}
		
		return 0;
	}
	
	private static int getlength(Node slow, Node fast){
		
		int count = 1;
		fast = fast.next;
		
		while(slow!=fast){
			count++;
			fast = fast.next.next;
		}
		return count;
	}


}
