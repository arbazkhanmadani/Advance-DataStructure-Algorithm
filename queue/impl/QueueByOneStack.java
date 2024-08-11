package in.dsa.queue.impl;

import java.util.Stack;

public class QueueByOneStack{

	private int size;
	private int length;
	private Stack<Integer> queue;
	
	public QueueByOneStack(int size){
		this.size = size;
		this.queue = new Stack<>();
	}
	
	
	public void enqueue(int data){
		
		if(length==size){
			System.out.println("stack is full.");
			return;
		}
		
		queue.push(data);
		length++;
	}
	
	public int dequeue(){
		
		if(length==0){
			System.out.println("stack is empty.");
			return -1;
		}
		
		int data = queue.pop();
		length--;
		return data;
	}
	
	
	public boolean isEmpty(){
		return length==0;
	}
	
	public int peek(){
		if(length==0){
			System.out.println("Stack is Empty");
			return -1;
		}
		return queue.peek();
	}
	
	public int size(){
		return length;
	}
	
	
	public void display(){
		
		if(length==0){
			System.out.println("stack is empty.");
			return;
		}
		
		for(int i =0; i<queue.size(); i++)
			System.out.print(queue.get(i)+" ");
		System.out.println();
				
	}
	
	
	//Driver Method........................
	public static void main(String[] args){
	
		QueueByOneStack q = new QueueByOneStack(5);
		
		q.display();
		System.out.println("isE : "+q.isEmpty());
		System.out.println("peek : "+q.peek());
		System.out.println("size : "+q.size());
		
		
		q.enqueue(11);
		q.enqueue(22);
		q.enqueue(33);
		q.enqueue(44);
		q.enqueue(55);
		
		q.display();
		System.out.println("isE : "+q.isEmpty());
		System.out.println("peek : "+q.peek());
		System.out.println("size : "+q.size());
		
		System.out.println("Dequeue : "+q.dequeue());
		System.out.println("Dequeue : "+q.dequeue());
		
		q.display();
		System.out.println("isE : "+q.isEmpty());
		System.out.println("peek : "+q.peek());
		System.out.println("size : "+q.size());
		
	}
	
}
