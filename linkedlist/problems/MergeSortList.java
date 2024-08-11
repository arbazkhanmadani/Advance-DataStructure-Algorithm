package in.dsa.linkedlist.problems;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class MergeSortList{

	 public static void main(String[] args){

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
        Node sortedHead = mergeSort(l.head);

        // Print the sorted list
        while(sortedHead != null){
            System.out.print(sortedHead.data + " ");
          sortedHead = sortedHead.next;
        }
        
    }
	
	 
	 public static Node mergeSort(Node head) {
        
		 // Base case: if the list is empty or has only one node, it's already sorted
        if(head == null || head.next == null) 
            return head;
        

        // Step 1: Split the list into two halves
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        
        //Split the list into two halves - It means after middle list is pointing to null.
        middle.next = null; 

        // Step 2: Recursively sort each half
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        // Step 3: Merge the two sorted halves
        return merge(left, right);
    }

    // Helper function to find the middle node of the list
    private static Node getMiddle(Node head) {
        
    	if(head == null) 
            return head;
        

        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper function to merge two sorted linked lists
    private static Node merge(Node left, Node right) {
        
    	// Create a dummy node to simplify the merge process
    	Node dummy = new Node(0);
    	Node sortedList = dummy;

        while(left != null && right != null){
            
        	if(left.data <= right.data){
        		sortedList.next = left;
        		//step up to next node i++;
                left = left.next;
            }
        	else{
        		sortedList.next = right;
        		//step up to next node j++;
        		right = right.next;
            }
        	
        	//step up to next node k++;
        	sortedList = sortedList.next;
        }

        //Append the remaining nodes of the non-empty list
        //If left is not at null it means it has the data. So we insert it at the end of sortedList.
        if(left != null) 
        	sortedList.next = left;
        //else right is not at null it means it has the data. So we insert it at the end of sortedList.
        else 
        	sortedList.next = right;
        
        //Return the merged sorted list's head.
        return dummy.next; 
    }

   
}
