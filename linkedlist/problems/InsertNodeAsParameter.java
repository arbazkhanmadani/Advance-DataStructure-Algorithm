package in.dsa.linkedlist.problems;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class InsertNodeAsParameter {

	public static void main(String[] args) {

	}

	public void insertNode(Node node, int data){
		node.data = node.next.data;
		node.next = node.next.next;	
	}
}
