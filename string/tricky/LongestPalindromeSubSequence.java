package in.dsa.string.tricky;

public class LongestPalindromeSubSequence {

 public static void main(String[] args) {
		
		
		String maxPalindrom = countSubstr("abccccdd");
		System.out.println(maxPalindrom);
		
	}
		

	public static String countSubstr(String s){
	
		int maxLen = 0;
		String maxPalindrome = "";
		for(int i = 0; i<s.length(); i++){
		
			for(int j = i; j<s.length(); j++){
			
				String sub = s.substring(i, j+1);
				
				if(isPalindrome(sub)){
					
					int len = sub.length();
					if(maxLen<len){
						maxLen = Math.max(maxLen, len);
						maxPalindrome = sub;
					}
				}
			}
		}
		System.out.println(maxLen);
		return maxPalindrome;
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
