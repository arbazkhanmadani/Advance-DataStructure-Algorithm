package in.dsa.linkedlist.problems;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class EvenOddPositionReordering {

	public static void main(String[] args){

		LinkedList l = new LinkedList();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.addLast(40);
		l.addLast(50);
		l.addLast(60);
		
		Node evenOddHead = evenOdd(l.head);
		System.out.println(evenOddHead.data);		
		while(evenOddHead!=null){
			System.out.print(evenOddHead.data+" ");		
			evenOddHead = evenOddHead.next;	
		}
	}
	
	
	
	public static Node evenOdd(Node head){
		
		if(head==null) return null;
		
		Node evenNode = new Node(0);
		Node oddNode = new Node(0);
		
		Node evenHead = evenNode;
		Node oddHead = oddNode;
		Node temp = head;

		while(temp!=null){
		
			//Linking odd Nodes
			oddHead.next = temp;
			//having linked odd position node forwarding head to even position
			temp = temp.next;
			//forwarding head of even to its next 
			oddHead = oddHead.next;
		
			//Linking even Nodes.
			evenHead.next = temp;
			//since after traversing all nodes we'll reach at last.next.next which is null->null.next(error)
			if(temp==null)break;
			//having linked even position node forwarding head to even position
			temp = temp.next;
			//forwarding head of even to its next 
			evenHead = evenHead.next;	
		}
		
		//Forwarding from dummy new Node(0) node to actual node.
		oddNode = oddNode.next;
		evenNode = evenNode.next;
		
		//Appending even nodes to odd nodes.
		oddHead.next = evenNode;
		
		
		return oddNode;
	}

}
