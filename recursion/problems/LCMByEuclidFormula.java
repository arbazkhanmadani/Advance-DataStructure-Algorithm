package in.dsa.recursion.problems;

public class LCMByEuclidFormula{

	public static void main(String[] args){
		
		int lcm = LCM(12,15);
		System.out.println(lcm);		
	}
	
	
	private static int GDC(int a, int b){
		if(b==0) return a;
		return GDC(b, a%b);
	}
	public static int LCM(int a, int b){
		return Math.abs(a*b)/GDC(a,b);
	}
	
}
