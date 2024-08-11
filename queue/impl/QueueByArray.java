package in.dsa.queue.impl;

public class QueueByArray{

	private int front = -1;
	private int rear = -1;
	private int size;
	private int length;
	private int[] queue;
	
	public QueueByArray(int size){
		this.size = size;
		this.queue = new int[size];
	}
	
	public void enqueue(int data){
		
		if(front==size){
			System.out.println("Queue is full.");
			return;
		}
		if(front==-1 || rear==-1)
			front=rear=0;
		
		queue[front++] = data;
		length++;
	}
	
	
	public int dequeue(){
		
		if(rear==size || rear==-1){
			System.out.println("Queue is empty.");
			return -1;
		}
		
		int data = queue[rear++];
		length--;
		return data;
	}
	
	public int peek(){
		return queue[rear];
	}
	public int size(){
		return length;
	}
	public boolean isEmpty(){
		return length==0;
	}
	
	public void display(){
		
		if(length==0)return;
		
		for(int i = rear; i<front; i++)
			System.out.print(queue[i]+" ");
		
		System.out.println();
	}
	
	
	public static void main(String[] args){
		
		QueueByArray q = new QueueByArray(5);
		q.display();
		System.out.println("empty : "+q.isEmpty());
		System.out.println("size : "+q.size());
		
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
