package in.dsa.zloop.logical2;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToInteger{
	
    public static void main(String[] args) {
        String s = "IX"; // Example input
        int result = romanToInt(s);
        System.out.println("Integer value of Roman numeral " + s + ": " + result);
    }

    public static int romanToInt(String s) {
        // Mapping Roman numerals to their integer values
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int total = 0;
        int length = s.length();

        // Iterate through the string
        for(int i = 0; i < length; i++){
            
        	//First Roman
        	int current = romanToIntMap.get(s.charAt(i));
            //Second Roman
        	int next = (i + 1 < length) ? romanToIntMap.get(s.charAt(i + 1)) : 0;

            if(current<next)
                total -= current; // Subtract if the current value is less than the next value
            else
                total += current; // Add otherwise
            
            
        }

        return total;
    }
}
