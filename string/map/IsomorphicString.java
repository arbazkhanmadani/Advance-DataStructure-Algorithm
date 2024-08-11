package in.dsa.string.map;

import java.util.HashMap;

/**
 If one to one mapping is possible thats called Isomorphic String...
 s1 = aab   s2 = xxy =>  a2=x2   b1=y1 
 **/
public class IsomorphicString {

	public static void main(String[] args) {


		boolean flag = isIsomorphic("aac","xxy");
		System.out.println(flag);
	}
	
	public static boolean isIsomorphic(String s1 , String s2){
		
		if(s1.length()!=s2.length())return false;
		
		HashMap<Character, Character> m = new HashMap<>();
		
		for(int i=0; i<s1.length(); i++){
			
			if(m.containsKey(s1.charAt(i))){
				char c = m.get(s1.charAt(i));
				
				if(c!=s2.charAt(i))
				return false;
			}
			else if(!m.containsValue(s2.charAt(i)))
				m.put(s1.charAt(i), s2.charAt(i));
			
			else return false;
		}
		
		return true;
	}

}
