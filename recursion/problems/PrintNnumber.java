package in.dsa.recursion.problems;

public class PrintNnumber {

	public static void main(String[] args){
		int n = 1,m=10;
		print(n,m);
	}

	public static int print(int n,int m){

		if(n==m+1)return n;
	
		System.out.println(n);
		print(n+1,m);
		
		return n;
	}

}
