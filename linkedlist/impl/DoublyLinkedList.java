package in.dsa.linkedlist.impl;

public class DoublyLinkedList{

	private Node head;
	private Node tail;
	private int size;
	
	static class Node{
		Node next;
		Node prev;
		int data;
		Node(int data){
			this.data = data;
		}	
	}
	
	//ADD METHODS==================
	//1. addFirst()................
	public void addFirst(int data){		
		
		Node temp = new Node(data);
		if(head==null){
			head=tail=temp;
			++size;
			return;
		}

		temp.next = head;
		head.prev = temp;
		head = temp;
		++size;
	} 

	
	//2. addLast()................
	public void addLast(int data){
		
		Node temp = new Node(data);

		temp.prev = tail;
		tail.next = temp;
		tail = temp;
		++size;
	} 
	
	//1. addAt()................
	public void addAt(int idx, int data){
		
		if(idx<0 || idx>=size){
			System.out.print("index can not be -Ve or >size.");
			return;
		}
		else if(idx==0){
			addFirst(data);
			return;
		}
		else if(idx==size-1){
			addLast(data);
			return;
		}
		
		Node newNode = new Node(data);
		Node temp = head;
		
		
		for(int i =0; i<idx-1; i++)
			//1st Index node.......
			temp = temp.next;
		 
		//newNode's next = 2nd's address;
		newNode.next = temp.next;
		//newNode's prev = 1st;
		newNode.prev = temp;
		
		//temp's next's prev = > 2nd's prev = newNode
		temp.next.prev = newNode;
		//1st's next = newNode 
		temp.next = newNode;
		++size;
	}

	
	//DELETE METHODS==================
	//1. removeFirst()................
	public void removeFirst(){
		
		if(head==null){
			System.out.println("No element to delete.");
			return;
		}
		if(head==tail){
			head = tail = null;		
			--size;
			return;
		}
		
		head = head.next;
		head.prev = null;
		--size;
	}
	
	//2. removeLast()................
	public void removeLast(){
			
		if(head==null){
			System.out.println("No element to delete.");
			return;
		}
		if(head==tail){
			head = tail = null;		
			--size;
			return;
		}
		
		tail = tail.prev;
		tail.next = null;
		--size;
	}
	
	//2. removeAt()...............
	public void removeAt(int idx){
		
		if(idx<0 || idx>=size){
			System.out.print("index can not be -Ve or >size.");
			return;
		}
		else if(idx==0){
			removeFirst();
			return;
		}
		else if(idx==size-1){
			removeLast();
			return;
		}
		
		Node temp = head;
		//Reach at 2nd idx.........
		for(int i = 0; i<idx; i++){
			temp = temp.next;
		}
		
		//2nd's 1st's next => 2nd.next = 3rd
		temp.prev.next = temp.next;
		//2nd's 3rd's prev => 3rd.prev = 1st 
		temp.next.prev = temp.prev;
		temp = null;
		--size;
	}
	
	
	//GET METHODS==================
	//1. getFirst()................
	public int getFirst(){
	
		Node temp = head;
		return temp.data;
	}
	

	//2. getLast()................
	public int getLast(){
		
		Node temp = tail;
		return temp.data;
	}
	

	//3. addAt()....................
	public int get(int idx){
		
		if(idx<0 || idx>=size){
			System.out.print("index can not be -Ve or >size.");
			return -1;
		}
		else if(idx==0)return getFirst();
		else if(idx==size-1)return getLast(); 
	
		Node temp = head;
		for(int i = 0; i<idx; i++){
			temp = temp.next;
		}
		return temp.data;
	}
	


	//UTILITY METHODS=================
	public int size(){
	
		if(size==0 || head==null) return 0;
		else return size;
	}
	
	public boolean isEmpty(){
		return(size==0 || head==null);
	}
	
	public void display(){
		if(head==null)return;
		
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+"->");
		 temp = temp.next;
		}
		System.out.println();		 
	}
	

	
	
	public static void main(String[] args){
		
		DoublyLinkedList dl = new DoublyLinkedList();
		
		System.out.println(dl.isEmpty());
		
		dl.addFirst(10);
		dl.addFirst(20);
		dl.addFirst(30);
		dl.addFirst(40);
		dl.display();
		
		dl.addLast(100);
		dl.display();
	
		dl.addAt(2, 0);
		dl.display();
		
		System.out.println(dl.size());
		System.out.println(dl.isEmpty());
		System.out.println(dl.get(3));
		System.out.println(dl.getFirst());
		System.out.println(dl.getLast());
		
		dl.removeFirst();
		dl.display();
	
		dl.removeLast();
		dl.display();
	
		dl.removeAt(2);
		dl.display();
	
		System.out.println(dl.size());		
	}

}
