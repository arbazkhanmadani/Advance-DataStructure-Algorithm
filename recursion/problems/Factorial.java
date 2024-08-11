package in.dsa.recursion.problems;

public class Factorial {

	public static void main(String[] args){
		
		int n = 5;
		int i = 1;
		int fact = 1;
		int factorial = factor(n,i,fact);
		System.out.println(factorial);
	}

	public static int factor(int n, int i, int fact){

		if(n<i) return fact;
		
		int factorial = factor(n,i+1,fact*i);
		
		return factorial;
	}

}
