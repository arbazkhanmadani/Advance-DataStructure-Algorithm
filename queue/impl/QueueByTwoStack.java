package in.dsa.queue.impl;

import java.util.Stack;

public class QueueByTwoStack{

	private int size;
	private static int capacity;
	private Stack<Integer> helper;
	private Stack<Integer> queue;
	
	public QueueByTwoStack(int size){
		this.size = size;
		this.queue = new Stack<>();
		this.helper = new Stack<>();
		
	}
	

	//helper to queue............
	private void transferStack(){
		while(!helper.isEmpty())
			queue.push(helper.pop());
	}
	
	//Push into helper............
	public void enqueue(int data){
		
		if(capacity==size){
			System.out.println("queue is filled.");
			return;
		}
		helper.push(data);
		++capacity;
	}

	//Pop from queue.....
	public int dequeue(){
	
		if(queue.isEmpty())transferStack();
		if(queue.isEmpty()){
			System.out.println("queue is empty.");
			return -1;
		}
		
		--capacity;
		return queue.pop();
	}
	
	public int front(){
		
		if(queue.isEmpty()) transferStack();
		if(queue.isEmpty()){
			System.out.println("queue is empty.");
			return -1;
		}
		
		return queue.peek();
	}
	
	public int rear(){
		
		if(!helper.isEmpty()) return helper.peek();
		else if(!queue.isEmpty())
			return queue.firstElement();
		else{
			System.out.println("queue is empty.");
			return -1;
		}
	}

	public boolean isEmpty(){
		return queue.isEmpty() && helper.isEmpty();
	}
	public boolean isFull(){
		return capacity==size;
	}
	public int size(){
		return capacity;
	}
	
	public void display(){
		
		if(queue.isEmpty()) transferStack();
		if(capacity==0){
			System.out.println("queue is empty.");
			return;
		}

		//Display REAR to FRONT.............
		for(int i = queue.size()-1; i>=0; i--)
			System.out.print(queue.get(i)+" ");
		
		//Display FRONT to REAR.............
		for(int i = 0; i<=helper.size()-1; i++)
			System.out.print(helper.get(i)+" ");
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {

		QueueByTwoStack q = new QueueByTwoStack(5);
		System.out.println("isE : "+q.isEmpty());
		System.out.println("isF : "+q.isFull());
		System.out.println("SIZE : "+q.size());
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(100);
		q.display();
		
		System.out.println("isE : "+q.isEmpty());
		System.out.println("isF : "+q.isFull());
		System.out.println("SIZE : "+q.size());
		
		
		q.dequeue();
		q.dequeue();
		q.enqueue(100);
		q.enqueue(200);
		//q.dequeue();
		q.display();
		System.out.println("TOP : "+capacity);
		System.out.println("REAR : "+q.rear());
		System.out.println("FRONT : "+q.front());
		System.out.println("SIZE : "+q.size());
		
		q.dequeue();
		q.display();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.display();
		q.dequeue();
		
	}

}
