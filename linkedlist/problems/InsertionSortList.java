package in.dsa.linkedlist.problems;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class InsertionSortList{
	
	
    public static void main(String[] args) {

    	LinkedList l = new LinkedList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(30);
		l.addLast(4);
		l.addLast(5);
		l.addLast(0);
		l.addLast(7);
		l.addLast(8);
		l.addLast(9);
		l.addLast(10);

        // Sort the list
        Node sortedHead = insertionSortList(l.head);

        // Print the sorted list
        Node current = sortedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

	
    public static Node insertionSortList(Node head) {
        
    	// Edge case: if the list is empty or has only one node, it's already sorted
        if (head == null || head.next == null)
            return head;
        

        // Create a dummy node to serve as the start of the sorted list
        Node sorted = new Node(Integer.MIN_VALUE);
        Node unsorted = head;

        while(unsorted!=null){
            
        	//For each node, find the correct place in the sorted list and insert it
            Node sortedTemp = sorted;
            System.out.println(sortedTemp.data);
            
            while(sortedTemp.next != null && sortedTemp.next.data < unsorted.data) 
            	sortedTemp = sortedTemp.next;
            System.out.println(sortedTemp.data);
            Node unsortedTemp = unsorted.next; // Save the next node to process
            unsorted.next = sortedTemp.next;
            sortedTemp.next = unsorted;
            unsorted = unsortedTemp; // Move to the next node in the unsorted portion
        }

        return sorted.next; // Return the sorted list starting after the dummy node
    }

}

