package in.dsa.string.tricky;

public class MinmaxPalindromeSubSequence {

public static void main(String[] args) {
		
		
		String minPalindrom = countSubstr("abbaeae");
		System.out.println(minPalindrom);
		
	}
		

	public static String countSubstr(String s){
	
		int minLen = Integer.MAX_VALUE;
		String minPalindrome = "";
		for(int i = 0; i<s.length(); i++){
		
			for(int j = i; j<s.length(); j++){
			
				String sub = s.substring(i, j+1);
				
				if(isPalindrome(sub)){
					
					int len = sub.length();
					if(minLen>=len){
						minLen = Math.min(minLen, len);
						minPalindrome = sub;
					}
				}
			}
		}
		System.out.println(minLen);
		return minPalindrome;
	}
	
	
	public static boolean isPalindrome(String str){
			
		str = str.replace(" ", "").trim().toLowerCase();
		
		//Condition for ignoring a single char...
		if(str.length()==1)
			return false;
		
		for(int i = 0; i<str.length(); i++){
			
			char ch = str.charAt(i);
			if(str.charAt(i)!=str.charAt(str.length()-1 - i ))
				return false;
			
		}
		return true;
			
	}
}
