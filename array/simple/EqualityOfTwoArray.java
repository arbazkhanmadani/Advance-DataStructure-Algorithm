package in.dsa.array.simple;

public class EqualityOfTwoArray {

	public static void main(String[] args) {
		
		int[] a1 = {1,2,3,4,5,};
		int[] a2 = {1,2,3,4,5,};
		
		boolean r = equalityOfArray(a1,a2);
		System.out.println("Both the arrays are equal : "+r );
		
	}
	
	
	public static boolean equalityOfArray(int[] a1, int a2[]){
		
		if(a1.length!=a2.length)
			return false;
		
		for(int i=0, j=0; i<a1.length || j<a2.length; i++, j++)
			if(a1[i]!=a2[j] ) 
				return false;
		
		return true;
	}

}
