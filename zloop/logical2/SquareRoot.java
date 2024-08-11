package in.dsa.zloop.logical2;

public class SquareRoot {

	public static void main(String[] args){
		
		int n = 25;
		System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
	} 
	
	
	public static double squareRoot(int num){  
	
		double t;  
		double sqrtroot=num/2;  
	
		do{
			
			t=sqrtroot;  
			sqrtroot=(t+(num/t))/2;  
		
		}while((t-sqrtroot)!= 0);  
	
		return sqrtroot;  
	}
	
}
