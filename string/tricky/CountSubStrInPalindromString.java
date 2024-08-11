package in.dsa.string.tricky;

public class CountSubStrInPalindromString {

	
	public static void main(String[] args) {
		
		
		int c = countSubstr("abbaeae");
		System.out.println(c);
		
	}
		

	public static int countSubstr(String s){
	
		int count = 0;
		for(int i = 0; i<s.length(); i++){
		
			for(int j = i; j<s.length(); j++){
			
				String sub = s.substring(i, j+1);
				if(isPalindrome(sub)){
					count++;
					System.out.println(sub);
					
				}
			}
		}
		return count;
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
