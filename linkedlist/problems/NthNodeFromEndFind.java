package in.dsa.linkedlist.problems;

import java.util.ArrayList;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class NthNodeFromEndFind{

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
		System.out.print(newHead.data+" ");		
		
	}

	
	public static Node nthNode(Node head, int n){
		
		if(head==null ) return head;
		
		//This is fo76r last and first Node.........
		ArrayList<Object> nodeLength = getLength(head);
		Integer len = (Integer)nodeLength.get(0);
		Node lastNode = (Node)nodeLength.get(1);
		
		if(n==0) return lastNode;
		if(n<0) return null;
		if(n==len) return head;
		if(n>len) return null;
		
		Node slow = head;
		Node fast = head;
		
		//moving fast to nth from beginning...
		for(int i = 0; i<n; i++)
			fast = fast.next;
		
		while(fast.next!=null){
			slow = slow.next;
			fast = fast.next;
		}
		
		//System.out.println(slow.next.data);
		//slow.next -> bcz slow stops before Nth node. 
		return slow.next;
	}
	
	private static ArrayList<Object> getLength(Node head){
		
		if(head==null) return null;
		
		Node temp = head;
		int count  = 0;
		while(temp.next!=null){
			count++;
			temp = temp.next;
		}	
		
		ArrayList<Object> al = new ArrayList<>();
		al.add(count);
		al.add(temp);
		
		return al;
	}
}
