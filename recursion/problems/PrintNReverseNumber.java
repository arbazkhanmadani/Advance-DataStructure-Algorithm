package in.dsa.recursion.problems;

public class PrintNReverseNumber {

	public static void main(String[] args){
		int n = 10;
		print(n);
	}

	public static int print(int n){

		if(n==0)return n;
	
		System.out.println(n);
		print(n-1);
		
		return n;
	}

}
