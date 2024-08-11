package in.dsa.string.map;

import java.util.*;

public class EqualNumberOfTwoSubStr {


	public static void main(String[] args) {
		
		boolean count = equalNumberOfTwoSubStr("she is the genius is of the earth and  she is awesome.", "is","the");
		System.out.println(count);
	}

	
	public static boolean equalNumberOfTwoSubStr(String s, String is, String the){
	
		String carray[] =  s.split(" ");
		Map<String, Integer> m = new HashMap<>();
		
		for(String ch : carray){
			
			if( m.containsKey(ch) )
				m.put(ch, m.get(ch)+1 );
			else
				m.put(ch, 1);
		}
		
		int isCount = 0;
		int theCount = 0;
		for(Map.Entry<String, Integer> entry : m.entrySet()) {
			
			String key = entry.getKey();	
			if(key.equals(is))
				isCount = entry.getValue();
			else if(key.equals(the))
				theCount = entry.getValue();

		}
		System.out.println(m);
		if(isCount==theCount)
			return true;
		else
			return false;
		
		//System.out.println(m);
	}
	
	
}
