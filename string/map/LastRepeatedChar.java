package in.dsa.string.map;

import java.util.*;

import javax.net.ssl.SSLContext;

public class LastRepeatedChar{

	public static void main(String[] args) {
		
		char ch = duplicateChars("elhloh");
		System.out.println(ch);
	}
	
	public static char duplicateChars(String s){
		
		HashSet<Character> hm = new HashSet<>();
		char carray[] =  s.replace(" ", "").toCharArray();
		
		for(int i = carray.length-1; i>=0; i--){
			
			if(hm.contains(carray[i]))
				return carray[i];
			
			hm.add(carray[i]);
		}
			
		
		return '\0';
	
	}

}
