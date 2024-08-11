package in.dsa.stack.impl;

public class StackByLinkedList{

	private int size;
	private Node head;
	
	static class Node{
		private int data;
		private Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	
	public void push(int data){
		
		Node temp = new Node(data);
		if(head==null){
			head=temp;
			size++;
			return;
		}
		
		//head            
		// 44 -> 33 -> 22 -> 11
		temp.next = head;
		head = temp;
		
		size++;
	}
	
	

	public int pop(){
		
		if(head==null){
			System.out.println("Stack is Empty");
			return -1;
		}
		
		int data = head.data;
		head = head.next;
		size--;
		
		return data;
	}
	
	public void display(){
		
		if(head==null){
			System.out.println("Stack is empty");
			return;
		}
		
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
		 temp = temp.next;
		}System.out.println();
	}
	
	
	
	public int peek(){
		
		if(head==null){
			System.out.println("Stack is Empty");
			return -1;
		}
		return head.data;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
		
	
	
	//Driver Method........................
	public static void main(String[] args){

		StackByLinkedList s = new StackByLinkedList();
		
		System.out.println("isE : "+s.isEmpty());
		System.out.println("Peek : "+s.peek());
		System.out.println("Size : "+s.size());
		s.display();
		
		s.push(11);
		s.push(22);
		s.push(33);
		s.push(44);
		s.display();
		
		System.out.println("Peek : "+s.peek());
		System.out.println("pop : "+s.pop());
		System.out.println("isE : "+s.isEmpty());
		System.out.println("Peek : "+s.peek());
		System.out.println("Size : "+s.size());
		s.display();
		
			/*System.out.println(s.isEmpty());
			s.push(10);
			s.push(100);
			s.push(1000);
			s.push(10000);
			s.display();
			System.out.println(s.isFull());
			s.pop();
			s.display();
			System.out.println(s.isFull());
			System.out.println(s.isEmpty());
			*/
			
	}

}
