package in.dsa.stack.impl;

public class StackByArray{
	
	private int size;
	private static int top;
	private int[] stack;
	

	//Constructor.................
	public StackByArray(int size){
		this.size = size;
		this.top = -1;
		this.stack = new int[this.size];
	}
	

	//Display.............
	public void display(){
		if(stack==null) {
			System.out.println("No element...");
			return;
		}
		System.out.print("[");
		for(int i =0; i<top; i++)
		System.out.print(stack[i]+" ");
		System.out.print("]");
		
	}
	

	//Push.....................
	public void push(int data){
		if(stack.length==top) {
			System.out.println("Stack is filed...");
			return;
		}
		stack[++top] = data;
	}
	

	//Display.........
	public int pop(){
		if(top==-1) {
			System.out.println("Stack is empty...");
			return -1;
		}
		int data = stack[top];
		--top;
		return data;
	}
	
	
	//Display.........
	public int peek(){
		if(top==-1){
			System.out.println("Stack is empty...");
			 return -1;
		}
	
		return stack[top];
	}
	
	//Display.........
	public boolean isEmpty(){
		return top==-1;
	}
	
	//Display.........
	public boolean isFull(){
		//size-1 => Looping till index.
		return top==size-1;
	}
	
	//Driver Method........................
	public static void main(String[] args){

		StackByArray s = new StackByArray(4);
		s.push(10);
		s.push(100);
		s.push(1000);
		s.push(10000);
		System.out.println("Is Full : "+s.isFull());
		
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
		
	}

}
