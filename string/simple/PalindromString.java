package in.dsa.string.simple;

class PalindromString {

	public static void main(String[] args) {
		
		if(isPalindrome("Madam")){
			System.out.println("Its palindrome");
		}else{
			System.out.println("Its not palindrome");
		}
	}
		
	public static boolean isPalindrome(String str){
			
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		// int j = str.length()-1;
		int len = str.length()-1;
		
		for(int i = 0; i<str.length(); i++){
				
			char ch = str.charAt(i);
			if(str.charAt(i)!=str.charAt(len - i)){
				return false;
			}
			//j--;
		}
		return true;
			
	}
}
