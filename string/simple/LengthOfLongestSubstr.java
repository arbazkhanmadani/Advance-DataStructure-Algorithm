package in.dsa.string.simple;

public class LengthOfLongestSubstr {

	public static void main(String[] args) {

		int len = longestSubString("java is   	 a      programing	    language.");
		System.out.println("the longest subStr of length "+len);
		
	}
	
	
	public static int longestSubString(String s){
		
		String[] sarray = s.trim().replaceAll("[\t ' ']", "%").split("%");
		int strLen = sarray[0].length();
		
		for(int i = 0; i<sarray.length; i++){
			
			if(sarray[i].length()>strLen){
				strLen = sarray[i].length();
		
			}
		}
		
		return strLen;
	}
}
