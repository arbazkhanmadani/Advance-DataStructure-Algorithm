package in.dsa.stack.impl;

import java.util.*;

public class StackByQueue {

	private Queue<Integer> stack;
	private int size =-1;
	public StackByQueue(){
		this.size = 4;
		this.stack = new LinkedList<>();
	}
	
	
	//Push.....................
	public void push(int data){
		
		if(stack.size()==size) {
			System.out.println("Stack is filed...");
			return;
		}
		
		//Inserting 1st Element....
		stack.add(data);
		
		//[10, 100, 1000, 10000] => [10000, 1000, 100, 10] => FIFO.
		for(int i = stack.size(); i>1; i--)
			stack.add(stack.remove());
			
		++size;
	}

	
	//Pop.........
	public void pop(){
		if(size==-1) {
			System.out.println("Stack is empty...");
			return;
		}
		stack.remove();
		--size;
	}
	
	//Peek.........
	public int peek(){
		if(size==-1) {
			System.out.println("Stack is empty...");
			 return -1;
		}
		
		int peek = stack.peek();
		return peek;
	}
		
	
	//isEmpty.........
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	//isFull.........
	public boolean isFull(){
		return stack.size()==size;
	}
	
	
	@Override
	public String toString() {
		return "StackByQueue [stack=" + stack + "]";
	}


		//Driver Method........................
		public static void main(String[] args){

			StackByQueue s = new StackByQueue();
			
			System.out.println(s.isEmpty());
			System.out.println(s.isFull());
			
			s.push(10);
			s.push(100);
			s.push(1000);
			s.push(10000);
			System.out.println(s);
			System.out.println(s.isFull());
			
			s.pop();
			System.out.println(s);
			System.out.println(s.peek());
			
			System.out.println(s.isEmpty());
			System.out.println(s.isFull());
			
			/*System.out.println("Is Full : "+s.isFull());
			
			s.display();
			System.out.println(top);
			s.pop();
			s.display();
			System.out.println(top);
			
			System.out.println("Is Empty : "+s.isEmpty());
			System.out.println("Is Full : "+s.isFull());
			s.pop();
			s.pop();
			s.pop();
			s.display();
			s.pop();
			s.peek();
			System.out.println("Is Empty : "+s.isEmpty());
			System.out.println("Is Full : "+s.isFull());
			*/
		}

}
