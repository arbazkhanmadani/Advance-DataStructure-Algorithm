package in.dsa.designpattern;

/**
 * @author arbaz
 * 
 DEIFINITION :The Prototype design pattern is a creational design pattern that focuses on creating objects
 			  based on a prototype instance. Instead of instantiating new objects directly,
 			  the pattern involves cloning an existing instance (prototype) and then customizing it as needed.
 			  
USES : 
	1.Dynamic Object Creation:
	2.Avoiding Sub classing: Provides an alternative to subclassing for creating new objects.
	3.Customization: 
	
PROS:
	1.Reduced Initialization Cost: 
	2.Flexibility: Allows for dynamic object creation and customization at runtime. 
	3.Simplified Object Creation: 
	
CONS:
	1.Cloning Complex Objects: Cloning complex objects, especially those with nested objects or deep structures.
	2.Duplication of Code:
	3.Deep Copy vs Shallow Copy: Depending on the deep copy or a shallow copy performance issues may arise.
	 
*/

interface Shapes{
	Shapes clone();
}

class ShapeImpl implements Shapes{
	
	private String type;
	
	public ShapeImpl(String type){
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}
	
	@Override
	public Shapes clone(){
		return new ShapeImpl(this.type);
		
	}
	
	
}


public class Protoype{
	
	public static void main(String... args){
		
		ShapeImpl shape1 = new ShapeImpl("Prototype");		
		ShapeImpl shape2 = (ShapeImpl)shape1.clone();
		
		System.out.println(shape1);
		System.out.println(shape1.getType());
		System.out.println(shape2);
		System.out.println(shape2.getType());
		
	}
}