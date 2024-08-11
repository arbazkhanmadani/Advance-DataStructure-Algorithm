package in.dsa.linkedlist.problems;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class DeleteNodeGivenAsParameter{

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		
		deleteNode(ll.head.next);
		
		while(ll.head!=null){
			System.out.print(ll.head.data+" ");
		ll.head = ll.head.next;
		}
	}
	
	public static void deleteNode(Node nodeToDelete){
	
		//This is for last node.....
		if(nodeToDelete==null ||nodeToDelete.next==null)
			return;
        
        //first we will overwrite the data of next node into given node.
    	nodeToDelete.data = nodeToDelete.next.data;
            
    	//then putting next to next nodes address to given node so that give's next will be destroyed.
    	nodeToDelete.next = nodeToDelete.next.next;
        
	}
	

}
