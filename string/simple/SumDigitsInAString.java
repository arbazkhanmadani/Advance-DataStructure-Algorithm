package in.dsa.string.simple;

public class SumDigitsInAString {

	public static void main(String[] args) {

		String s = "0abc21xy201-1";
		int sum = sumDigitsInAString(s);
		System.out.println(sum);
		
	}
	
	
	public static int sumDigitsInAString(String str){
		
		int sum = 0;
		for(int i =0; i<str.length(); i++){
			
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
				sum += Integer.parseInt(ch+"");
		}
		
		if(sum>0)
			return sum;
		else
			return 0;
	}

}
