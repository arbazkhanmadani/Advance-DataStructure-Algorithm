package in.dsa.string.simple;

public class SmallestSubString {


	public static void main(String[] args) {

		String sStr = smallestSubString("java is a programing language.");
		System.out.println("the longest subStr is : \""+ sStr +"\" : of length "+sStr.length());
		
	}
	
	
	public static String smallestSubString(String s){
		
		String[] sarray = s.trim().replaceAll("[\t ' ']", ",").split(",");
		int strLen = sarray[0].length();
		String smallestStr = "";
		
		for(int i = 0; i<sarray.length; i++){
			
			System.out.println(sarray[i]);
			if(sarray[i].length()<strLen){
				strLen = sarray[i].length();
				smallestStr = sarray[i];	
			}
		}
		
		return smallestStr;
	}

}
