package in.dsa.string.simple;

public class CountDigitInAString {

	public static void main(String[] args) {

		String s = "0abc21xy201-1";
		sumDigitsInAString(s);
	}
	
	
	public static void sumDigitsInAString(String str){
		
		int sum = 0, count = 0;
		for(int i =0; i<str.length(); i++){
			
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				count++;
			}
		}
		System.out.println("Number of digits in the string is : "+count);
	}
	
	
}
