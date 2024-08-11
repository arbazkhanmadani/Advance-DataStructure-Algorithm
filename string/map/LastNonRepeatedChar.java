package in.dsa.string.map;

import java.util.HashMap;

public class LastNonRepeatedChar{

	public static void main(String[] args){
		
		lastNonRepeated("aabbccrdeff");
	}

	
	public static void lastNonRepeated(String s){
	
		HashMap<Character, Integer> hm = new HashMap<>();
		char carray[] =  s.replace(" ", "").toCharArray();
		char ch = '\0';
		
		for(int i = 0; i<carray.length; i++)
			hm.put(carray[i], hm.getOrDefault(carray[i], 0)+1 );
			

		for(int i = 0; i<carray.length; i++)
			if(hm.get(carray[i])==1)
				ch = carray[i];	
		
		
		System.out.println(ch);
		System.out.println(hm);
		

	}

}
