package in.dsa.string.simple;

public class LongestSubString {

	public static void main(String[] args) {

		String lStr = longestSubString("java is   	 a      programing	    language.");
		System.out.println("the longest subStr is : \""+ lStr +"\" : of length "+lStr.length());
		
	}
	
	
	public static String longestSubString(String s){
		
		String[] sarray = s.trim().replaceAll("[\t ' ']", "%").split("%");
		int strLen = sarray[0].length();
		String longestStr = "";
		
		for(int i = 0; i<sarray.length; i++){
			
			System.out.println(sarray[i]);
			if(sarray[i].length()>strLen){
				strLen = sarray[i].length();
				longestStr = sarray[i];	
			}
		}
		
		return longestStr;
	}

}
