package in.dsa.recursion.problems;

public class FibonaciSeriesByRecursion {


	//fibonacci series = 0+1=1+2=2+3=3+5=8+5=13.......+,
	public static void main(String[] args){
		int n = 10;
		for(int i=0; i<=10;i++)System.out.println(fibonaci(i));
	}

	public static int fibonaci(int n){

		if(n<=1) return n;
		
		return fibonaci(n-1) + fibonaci(n-2);
	}
}
