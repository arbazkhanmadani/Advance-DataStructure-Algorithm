package in.dsa.recursion.problems;

public class ReverseString {


	public static void main(String[] args){
		
		String s = "Arbaz Khan";
		String s1 = reverse(s);
		System.out.println(s1);
	}

	public static String reverse(String s){

		//If the string is empty or has 1 char;
		if(s==null || s.length()<=1)return s;
	
		//Reverse the sub string and concatenate 1st char at the end.
		return reverse( s.substring(1) ) + s.charAt(0);
	
	}

}
