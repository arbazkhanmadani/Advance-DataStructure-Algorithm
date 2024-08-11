package in.dsa.designpattern;

/**
 * @author arbaz
 * 
DEFINITION :The Factory design pattern is a creational design pattern that provides an interface for creating
			objects in a superclass, but allows subclasses to alter the type of objects that will be created.	
			
NEED : 
	1.Encapsulation of Object Creation: 
	2.Flexibility in Object Creation: It allows subclasses to change Object.
	3.Centralized Maintenance: 
	
PROS:
	1.Separation of Concerns:
	2.Code Reusability: 
	3.Easier Testing: 
	
CONS:
	1.Increased Complexity.
	2.Requires Knowledge of Subclasses:
 */

//Common Behavior......
interface Shape{
	void draw();
}

//Object 1....................
class Circle implements Shape{
	@Override
	public void draw(){
		System.out.println("Draw Circle.......");
	}

}

//Object 2......................
class Rectangle implements Shape{
	@Override
	public void draw(){
		System.out.println("Draw Circle.......");
	}
}

//Factory -> for getting objects..........
public class Factory{

	public Shape getInstance(String type){
		
		if(type.equalsIgnoreCase("circle"))
			return new Circle();
		else if(type.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		else
			return null;	
	}
}


class FactoryTest{

	public static void main(String[] args) {

		Factory factory = new Factory();
		
		Shape circle = factory.getInstance("CIRCLE");
		System.out.println(circle);
	
		Shape reactangle = factory.getInstance("rectangle");
		System.out.println(reactangle);
	
	
	}

}