package in.dsa.string.simple;

import java.util.Arrays;

public class AnagramString {


	public static void main(String[] args) {
		
		if(isAnagram("mother in law", "hitler woman")){
			System.out.println("Its Anagram");
		}else{
			System.out.println("Its not Anagram");
		}
	}
		
	public static boolean isAnagram(String str1, String str2){
		
		boolean flag = false;
		str1 = str1.replace(" ", "").trim().toLowerCase();
		str2 = str2.replace(" ", "").trim().toLowerCase();
		
		char[] s1Array = str1.toCharArray();
		char[] s2Array = str2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		if(s1Array.length!=s2Array.length)
			return flag;
		else
			flag = Arrays.equals(s1Array, s2Array);
			
		
		
		return flag;
			
	}

}
