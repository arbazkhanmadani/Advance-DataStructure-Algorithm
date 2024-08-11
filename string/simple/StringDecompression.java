package in.dsa.string.simple;

public class StringDecompression {

	public static void main(String[] args){

		String compressed = smallestSubString("a2b1c2d5e1");
		System.out.println(compressed);
	}
	
	
	public static String smallestSubString(String s){
		
		String dStr = "";
		
		for(int i = 0; i<s.length()-1; i=i+2){
			
			char ch = s.charAt(i);
			char digit = s.charAt(i+1);
			
			if(Character.isDigit(digit))
				for(int j=0; j<Integer.parseInt(digit+""); j++)
					dStr += ch;	
		}
		
		return dStr;
	}

}
