package in.dsa.designpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreationTypes implements Cloneable {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException {

		
		//Type 1) NEW........................................
		ObjectCreationTypes obj1 = new ObjectCreationTypes();
		System.out.println("OBJ 1 : "+obj1);
		
		//Type 2) Deep copy...................................
		ObjectCreationTypes obj2 = obj1;
		System.out.println("OBJ 2 : "+obj2);
		
		
		//Type 3) Shallow copy clone()................................
		//NOTE : Here we have to implements Cloneable interface in respective class. 
		ObjectCreationTypes obj3 =  (ObjectCreationTypes)obj2.clone();
		System.out.println("OBJ 3 : "+obj3);
		

		//Type 4) Class class's newInstance().............................
		ObjectCreationTypes obj4 = ObjectCreationTypes.class.newInstance();
		System.out.println("OBJ 4 : "+obj4);
		
		
		//Type 5) Constructor class's newInstance().......................
		Constructor instance = ObjectCreationTypes.class.getConstructor();
		ObjectCreationTypes obj5 = (ObjectCreationTypes)instance.newInstance();		
		System.out.println("OBJ 5 : "+obj5);
		
		
		//Type 6) Deserialization.......................
		/*ObjectInputStream os = new ObjectInputStream(new FileInputStream("object.ser"));
		ObjectCreationTypes obj6 = (ObjectCreationTypes)os.readObject();
		System.out.println("OBJ 6 : "+obj6);
		*/
		
		//Type 7) Factory...............................
		//Type 8) Builder...............................
		
		
	}

}
