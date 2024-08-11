package in.dsa.linkedlist.problems;

import java.util.Stack;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class IsPalindromeList {

	public static void main(String[] args){

		LinkedList l = new LinkedList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(3);
		l.addLast(2);
		l.addLast(1);
		//l.addLast(0);
		
		boolean cycleNode = isPalindrome(l.head);
		System.out.println("Is Cycle : "+cycleNode);		
		
		
	}
	
	
	public static boolean isPalindrome(Node head){
		
		if(head==null)return false;
		
		Stack<Integer> palindrome = new Stack<>();
		
		Node temp = head;
		while(temp!=null){
			palindrome.push(temp.data);
		 temp = temp.next;
		}
		
		System.out.println(palindrome);
		
		temp = head;
		while(temp!=null){
			
			int popped = palindrome.pop();
			if(popped!=temp.data)
				return false;
			
		  temp= temp.next;
		}
		
		
		return true;
	}

}
