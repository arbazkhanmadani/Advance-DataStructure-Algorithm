package in.dsa.string.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class MostFrequentStringInArray {

	public static void main(String[] args) {

		frequentString("aabbbbbccccdd");
	}
	
	
	public static void frequentString(String s){
		
		HashMap<Character, Integer> m = new HashMap<>(); 
		for(int i = 0; i<s.length(); i++){
			
			if( m.containsKey(s.charAt(i)) )
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
			else
				m.put(s.charAt(i), 1);
		}
		
		int max = Integer.MIN_VALUE;
		char maxStr = '\0';
		
		for(Entry<Character, Integer> entry : m.entrySet()){
			if(entry.getValue()>max){
				max = Math.max(entry.getValue(), max);
				maxStr = entry.getKey();
				System.out.println("most repeated : "+maxStr);
			}
		}
		System.out.println(m);
	}
}
