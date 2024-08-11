package in.dsa.string.map;

import java.util.*;
import java.util.Map.Entry;

public class UniqueCharacherInString {

	public static void main(String[] args) {
		uniqueChars("Hello   This");
	}
	
	public static void 	uniqueChars(String str){
		
		str = str.replace(" ", "").trim().toLowerCase();
		HashMap<Character, Boolean> m = new HashMap<>();
		
		for(int i = 0; i<str.length(); i++){
			
			char ch = str.charAt(i);
			if(m.get(ch)==null)
				m.put(ch,  false);
			else
				m.put(ch, true);
		}
		
		for(Entry<Character, Boolean> entry : m.entrySet())
			if(entry.getValue()==false)
				System.out.print(entry.getKey()+" ");
				System.out.print(" -> are unique character");
		
			
		
	}

}
