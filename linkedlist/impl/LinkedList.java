package in.dsa.linkedlist.impl;

public class LinkedList {

	public Node head;
	private Node tail;
	private int size;
	public LinkedList(){}

	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}

	
	//1. Insert Methods............
	//It adds at Last..............
	public void addLast(int data) {
		
		Node temp = new Node(data);
		if(head==null) {
			head = tail = temp;
			size++;
			return;
		}
					
		tail.next = temp;
		tail = temp;
		size++;
	}
	
	//It adds at Beginning............
	public void addFirst(int data) {
		
		Node temp = new Node(data);
		if(head==null) {
			head = tail = temp;
			size++;
			return;
		}
		else{			
			temp.next = head;
			head = temp;
		}
		size++;
	}

	//It adds at specific Index Beginning............
	public void addAt(int idx, int data) {
		
		Node temp = new Node(data);
		Node helper = head;
		
		//So that idx must not be equal size else tail wont go to end.
		if(idx==size()-1){
			addLast(data);
			return;
		}
		//preserving head.
		else if(idx==0){
			addFirst(data);
			return;
		}
		else if(idx<0 || idx>size()){
			System.out.println("Index can't be negative. or greater than size.");
			return;
		}
		
		// have to go idx-1 => before the specify idx for getting prev node.
		for(int i=1; i<=idx-1; i++)
			helper = helper.next;
			
		System.out.println("helper"+helper.data);
		temp.next = helper.next;
		helper.next = temp;
		size++;
	}

	//2. Delete Methods.........
	//Remove First..............
	public void removeFirst(){
		
		if(head==null)return;
		head = head.next;
		size--;
	}
	
	//Remove Last.............
	public void removeLast(){

		if(head==null) return;
		if(head.next==null) return;
		
		Node temp = head;
		while(temp.next.next!=null)
			//2nd last node.
			temp = temp.next;
		
		//last node become null.
		temp.next= null;
		size--;
	}
	
	//Remove at index...........
	public void removeAt(int idx){
		
		if(idx==0){
			head = head.next;
			size--;
			return;
		}
		if(idx==size-1){
			removeLast();
			size--;
			return;
		}
		else if(idx<0 || idx>=size()){
			System.out.println("Index can't be negative. or greater than size.");
			return;
		}
		
		Node temp = head;
		//we have to go previous of given node.
		for(int i =0; i<idx-1; i++){
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
	}

	//3. Get Methods............
	public int getFrist(){
		
		if(head==null)return -1;
		return head.data;
	}
	
	//3. Get Methods............
	public int getLast(){
			
		if(head==null)return -1;
		
		Node temp = head;
		//temp!=null -> reaches till last node where no next. NullPointerE.
		while(temp.next!=null)
			temp = temp.next;
		return temp.data;
	}
		
	public int get(int idx){
		
		if(idx<0 || idx>=size()){
			System.out.println("Index can't be negative. or greater than size.");
			return -1;
		}
		Node temp =  head;
		//forwarding head till specified index.
		for(int i =0; i<idx; i++){
			temp = temp.next;
		}
		return temp.data;
	}

	
	//4. utility Methods..........
	public int size(){
		
		//Way 1. Return size only if LinkedList class is given in question.
		//return size;
		
		//way 2. If head is given.....
		Node temp = head;
		int count = 0;
		while(temp!=null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public boolean isEmpty(){
		return (size==0 || head==null);
	}
	
	public void display(){
		
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+"->");
		  temp = temp.next;
		}
		System.out.println();		  
	}
	
	
	
	
	public static void main(String[] args) {

		LinkedList a = new LinkedList();
		
		a.addLast(10);
		a.addLast(20);
		a.addLast(30);
		a.display();
		a.addFirst(0);
		a.display();
		
		a.addAt(2, 100);
		a.display();
		a.addAt(0, 200);
		a.display();
		a.addAt(-1, 200);
		a.display();
		a.addAt(10, 200);
		a.display();
		
		a.removeAt(2);
		a.display();
		a.removeFirst();
		a.display();
		a.removeLast();
		a.display();
		
		System.out.println("size : "+a.size());
		
		System.out.println("get(idx): "+ a.get(2));
		System.out.println("get(idx): "+ a.get(-1));
		System.out.println("get(idx): "+ a.get(20));
		System.out.println(a.getFrist());
		System.out.println(a.getLast());
		
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		

		/*
		LinkedList b = new LinkedList();
		LinkedList c = new LinkedList();
		LinkedList d = new LinkedList();
		
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		System.out.println("c : "+ c);
		System.out.println("d : "+ d);
		System.out.println("===============");
		
		a = b;
		b = c;
		c = d;
		System.out.println("a=b : "+ a);
		System.out.println("b=c : "+ b);
		System.out.println("c=d : "+ c);
		System.out.println(d);
		*/
	}

}
