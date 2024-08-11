package in.dsa.string.map;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagramByMap {

	public static void main(String[] args){
		System.out.println(isAnagram("mother in law", "hitler woman"));
	}
	
	
	public static boolean isAnagram(String s1, String s2){
	
		s1 = s1.replaceAll(" ", "");
		s2 = s2.replaceAll(" ", "");
		if(s1.length()!=s2.length()) return false;
		
		Map<Character, Integer> hm1 = frequency(s1);
		Map<Character, Integer> hm2 = frequency(s2);
		
		return hm1.equals(hm2);
	}
	
	public static Map<Character, Integer> frequency(String s){
		
		s = s.replaceAll(" ", "");
		Map<Character, Integer> hm = new HashMap<>();
		
		for(int i=0; i<s.length(); i++)
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1 );
		return hm;
	}
}
