package in.dsa.recursion.problems;

public class Factor {

	public static void main(String[] args){
		
		int n = 20;
		int i = 1;
		factor(n,i);
	}

	public static void factor(int n, int i){

		if(n<i)return;
	
		if(n%i==0)
			System.out.print(i+" ");
		
		factor(n,i+1);
	}
}
