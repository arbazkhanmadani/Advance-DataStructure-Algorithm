package in.dsa.string.map;

import java.util.HashMap;

class FirstNonRepeatedChar{

	public static void main(String[] args){
		
		firstNonRepeated("aabbrccdef");
	}

	
	public static void firstNonRepeated(String s){
	
		HashMap<Character, Integer> hm = new HashMap<>();
		char carray[] =  s.replace(" ", "").toCharArray();
		char ch = '\0';
		
		for(int i = 0; i<carray.length; i++)
			hm.put(carray[i], hm.getOrDefault(carray[i], 0)+1 );
			

		for(int i = 0; i<carray.length; i++){
			
			if(hm.get(carray[i])==1){
				ch = carray[i];
				break;
			}
			
		}
		
		System.out.println(ch);
		
	}

}
