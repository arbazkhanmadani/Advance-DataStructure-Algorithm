package in.dsa.string.map;

import java.util.HashSet;

public class FirstRepeatedChar{

	public static void main(String[] args){
		
		char ch = firstRepeated("abcdcrefff");
		System.out.println(ch);
	}
	

	public static char firstRepeated(String s){
	
		HashSet<Character> hm = new HashSet<>();
		char carray[] =  s.replace(" ", "").toCharArray();
		
		for(int i = 0; i<carray.length; i++){
			
			if(hm.contains(carray[i]))
				return carray[i];
			
			hm.add(carray[i]);
		}
			
		
		return '\0';	
	}

}
