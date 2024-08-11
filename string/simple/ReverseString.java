package in.dsa.string.simple;

public class ReverseString {

	public static void main(String[] args){
		String r = reverseString("I love java programing language");
		System.out.println(r);
	}
	
	public static String reverseString(String str){
		
		String newStr = "";
		for(int i =str.length()-1; i>-1;i--){
			
			char ch = str.charAt(i);
			newStr = newStr+ch;
		}
		
		return newStr;
		
	}
}
