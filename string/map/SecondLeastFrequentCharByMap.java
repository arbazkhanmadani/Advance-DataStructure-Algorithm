package in.dsa.string.map;

import java.util.*;

public class SecondLeastFrequentCharByMap{

	public static void main(String[] args){
		
		leastFrequent("aaaaabbbbbbccccd");
	}

	
	public static void leastFrequent(String s){
	
		char carray[] =  s.replace(" ", "").toCharArray();
		Map<Character, Integer> m = new TreeMap<>();
		
		for(char ch : carray){
			
			if( m.containsKey(ch) )
				m.put(ch, m.get(ch)+1 );
			else
				m.put(ch, 1);

		}
		
		int min = Integer.MAX_VALUE;
		int smin = 0;
		char c = '\0';
		for(Map.Entry<Character, Integer> entry : m.entrySet()){
			
			int val = entry.getValue();
			if(val<min){
				smin = min;
				min = Math.min(val, min);
			}
			if(entry.getValue()==smin)c = entry.getKey();
		}
		
		System.out.println(smin+" " +c);
		System.out.println(m);
		
	}

}
