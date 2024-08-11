package in.dsa.designpattern;
/**
  @author arbaz

DEFINITION :The Singleton design pattern is a creational pattern that ensures a class has only
  			 one instance and provides a global point of access to that instance.

USES :
	1.Singleton is useful in scenarios where we need exactly one instance of a class to coordinate actions
	across the system, such as:
	2.Resource Sharing: When multiple components need to access a shared resource(eg DB connection,file sys).
	3.Global State Management: To maintain a single source of truth for configuration settings,
	logging, or managing preferences.
	4.Synchronization: In scenarios where multiple instances would lead to conflicts or inefficiencies.

PROS OF SINGLTON:
	1.Controlled Access: Provides a global point of access to the instance, ensuring a controlled
	 way to manage it.
	2.Reduced Memory Footprint: Ensures that only one instance exists, reducing memory usage,
	 especially in resource-intensive operations.
	3.Lazy Initialization: Allows for lazy initialization of the instance, i.e., the instance is created
	 only when it is first needed.

CONS OF SINGLTON:
	1.Global State: Can introduce global state in your application, which can make code harder to test and
	 debug.
	2.Harder to Extend: Difficult to extend or modify the singleton pattern since it directly controls its
	 instantiation and initialization.
	3.Concurrency Issues: In multi-threaded environments, concurrent access to the singleton instance might
	 require synchronization to prevent race conditions.
 */

public class Singleton {

	private static Singleton singleton;

	private Singleton(){}
	
	public static Singleton getInstance(){
		
		if(singleton==null){
			
			synchronized(Singleton.class){
				
				if(singleton==null){
					singleton = new Singleton();
				}
			}
		}
		
		return singleton;
	}
	
	
	public static void main(String[] args){
		
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
		
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1);
	
	}
}
