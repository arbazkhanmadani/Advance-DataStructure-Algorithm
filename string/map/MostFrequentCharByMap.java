package in.dsa.string.map;

import java.util.Map;
import java.util.TreeMap;

public class MostFrequentCharByMap {


	public static void main(String[] args) {
		
		mostFrequent("aaabbbbbccccd");
	}

	
	public static void mostFrequent(String s){
	
		char carray[] =  s.replace(" ", "").toCharArray();
		Map<Character, Integer> m = new TreeMap<>();
		
		for(char ch : carray){
			
			if( m.containsKey(ch) ){
				m.put(ch, m.get(ch)+1 );
			}
			else{
				m.put(ch, 1);
			}
		}
		int max = Integer.MIN_VALUE;
		char c = ' ';
		for(Map.Entry<Character, Integer> entry : m.entrySet()){
			
			int val = entry.getValue();
			if(val>=max){
				max = Math.max(val, max);
				c = entry.getKey();
			}
			
		}
		System.out.println(c+" is max "+max+" times");
	}
	
}
