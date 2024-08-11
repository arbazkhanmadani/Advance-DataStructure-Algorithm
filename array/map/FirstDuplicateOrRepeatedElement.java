package in.dsa.array.map;
import java.util.HashMap;

public class FirstDuplicateOrRepeatedElement {

		public static void main(String[] args) {

			duplicate(new int[] {1,2,3,5,7,5,7,7,4,3});	
		}
		
		public static void duplicate(int[] a){
			
			//if i wont show Generic here then at the time of Entry class i will get error.
			HashMap<Integer, Boolean> hm = new HashMap<>();
			for(int i =0; i<a.length; i++){
				
				if(hm.get(a[i])==null)
					// false key -> one time(unique) 
					hm.put(a[i], false);
					
				else{
					//1st way -> Repeating values....
					System.out.println("Repeating = " + a[i]);
					//break -> Printing only 1st Element...
					break;
				}
			}
			
						

		}
	

}
