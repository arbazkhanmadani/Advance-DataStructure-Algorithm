package in.dsa.stack.impl;

import java.util.LinkedList;


public class StackByLinkedListColection{

	private LinkedList<Integer> stack;
	private int size;
	
	public StackByLinkedListColection(){
		this.size = 4;
		this.stack = new LinkedList<>();
	}
	
	
	//Display.........
	public void display(){
		
		System.out.print("[");
		for(int i =0; i<stack.size(); i++) {
			System.out.print(stack.get(i)+" ");
		}
		System.out.print("]");
		System.out.println();
		
	}
		
	
	//Push.....................
	public void push(int data){
		if(stack.size()==size) {
			System.out.println("Stack is filed...");
			return;
		}
		stack.addFirst(data);
		
	}

	//Pop.............
	public void pop(){
		if(stack.isEmpty()) {
			System.out.println("Stack is empty...");
			return;
		}
		stack.removeFirst();
	}

	//Peek............
	public int peek(){
		if(stack.isEmpty()){
			System.out.println("Stack is empty...");
			return -1;
		}
		
		return stack.peek();
	}
	
	//isEmpty................
	public boolean isEmpty(){
		return stack.isEmpty();
	}

	//isFull.................
	public boolean isFull(){
		return stack.size()==size;
	}
	
	
	//Driver Method........................
	public static void main(String[] args){

		StackByLinkedListColection s = new StackByLinkedListColection();
			
			System.out.println(s.isEmpty());
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
			
			
	}


	
}
