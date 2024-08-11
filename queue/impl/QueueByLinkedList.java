package in.dsa.queue.impl;

public class QueueByLinkedList{

	
	private static class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
		}
	}
	
	private int size;
	//rear
	private Node head;
	//front
	private Node tail;
	public QueueByLinkedList(){}
	
	
	//Add data...................
	public void enqueue(int data){
	
		Node temp = new Node(data);
		if(tail==null){
			head = tail = temp;
			size++;
			return;
		}
		//Adding to the end for preserving FIFO.
		tail.next = temp;
		tail = temp;
		size++;
	}
	
	//Remove data...................
	public int dequeue(){
		
		if(isEmpty()){
			System.out.println("DEQUEUE : Queue s Empty");
			return -1;
		}
		
		int value = head.data;
		
		//Removing from head for preserving FIFO, and shifting head to next node of it.
		head = head.next;
		size--;
		return value;
	}

	//Peek............
	public int peek(){
		
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
	
		return head.data;
	}
	
	//Size............
	public int size(){
		return size;
	}

	//Empty............
	public boolean isEmpty(){
		return size==0 && head==null;
	}

	//display data.................
	public void display(){
	
		if(head==null){
			System.out.println("DISPLAY() : Theres no node.");
			return;
		}
		
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}System.out.println();
		
	}
	
	public static void main(String[] args) {

		QueueByLinkedList ql = new QueueByLinkedList();
		ql.dequeue();
		ql.display();
		System.out.println("isE : "+ql.isEmpty());
		System.out.println("SIZE : "+ql.size());
		
		ql.enqueue(10);
		ql.enqueue(20);
		ql.enqueue(30);
		ql.display();
		
		System.out.println("isE : "+ql.isEmpty());
		System.out.println("SIZE : "+ql.size());
		
		System.out.println("DEQUEUE : "+ql.dequeue());
		ql.display();
		System.out.println("PEEK : "+ql.peek());
		
	}
}
