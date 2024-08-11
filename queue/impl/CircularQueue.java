package in.dsa.queue.impl;
/**
 For making Circular Queue we only have to do=>
 	
 	rear = (rear+1)/size;
 	front = (front+1)/size;
 */

public class CircularQueue{

	private int front = -1;
	private int rear = -1;
	private int size;
	private int length;
	private int[] queue;
	
	public CircularQueue(int size){
		this.size = size;
		this.queue = new int[size];
	}
	
	public void enqueue(int data){
		
		if(rear==size){
			System.out.println("Queue is full.");
			return;
		}
		
		rear = (rear+1)%size;
		queue[rear] = data;
		
		length++;
	}
	
	
	public int dequeue(){
		
		if(isEmpty()){
			System.out.println("Queue is empty.");
			return -1;
		}
		
		front = (front+1)%size; 
		int data = queue[front];
		length--;
		
		return data;
	}
	
	public int peek(){
		
		if(isEmpty()){
			System.out.println("Queue is empty.");
			return -1;
		}
		return queue[front+1];
	}
	public int size(){
		return length;
	}
	public boolean isEmpty(){
		return length==0;
	}
	
	public void display(){
		
		if(length==0)return;
		
		for(int i = 0; i<length; i++)
			System.out.print(queue[i]+" ");
		
		System.out.println();
	}
	
	
	public static void main(String[] args){
		
		CircularQueue q = new CircularQueue(5);
		
		q.display();
		System.out.println("empty : "+q.isEmpty());
		System.out.println("size : "+q.size());
		System.out.println("peek : "+q.peek());
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		System.out.println("peek : "+q.peek());
		System.out.println("empty : "+q.isEmpty());
		System.out.println("size : "+q.size());
		
		q.display();
		System.out.println("dequeue : "+q.dequeue());
		System.out.println("peek : "+q.peek());
		
		System.out.println("dequeue : "+q.dequeue());
		System.out.println("dequeue : "+q.dequeue());
		System.out.println("dequeue : "+q.dequeue());
		System.out.println("dequeue : "+q.dequeue());

		System.out.println("empty : "+q.isEmpty());
		System.out.println("size : "+q.size());
		
		q.display();
	} 


}
