package in.dsa.recursion.problems;

public class PrintReverseString {

	public static void main(String[] args){
		
		String s = "Arbaz khan";
		int n = s.length();
		reverse(s,0,n-1);
	}

	public static void reverse(String s, int i, int j){

		if(i==s.length())return;
	
		System.out.print(s.charAt(j));
		reverse(s, i+1, j-1);
		
		//System.out.print(s.charAt(j)+" ");// -> print non-reverse.
		
	}

}
