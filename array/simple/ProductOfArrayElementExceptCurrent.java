package in.dsa.array.simple;

public class ProductOfArrayElementExceptCurrent {

	public static void main(String[] args) {

		int[] a = product(new int[]{1,2,3,4});
		//for(int e : a) System.out.print(e+" ");
	}
	
	public static void print(int[]a){

		for(int i = 0; i<a.length; i++ ){
		System.out.print(a[i]+" ");
		} 
		System.out.println();
		
	}
	public static int[] product(int[] a){

		int leftPro=1;
		int rightPro=1;
		
		int[] pro = new int[a.length];
		
		//left array product.............
		for(int i = 0; i<a.length; i++ ){
			pro[i] = leftPro;
			leftPro = leftPro*a[i];
		} 
		print(pro);
			
		//right array product............
		for(int i = a.length-1; i>=0; i--){
			pro[i] = pro[i]*rightPro;
			rightPro = rightPro*a[i];
		} 
		print(pro);
		
		return pro;
	}
}
