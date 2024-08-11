package in.dsa.zloop.logical2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
For number = 3749:

	3000 = "MMM"
	700 = "DCC"
	40 = "XL"
	9 = "IX"
	Combining these gives - "MMMDCCXLIX".
*/
public class ConvertIntegerToRoman {

    public static void main(String[] args) {

    	// Example 1
        int num1 = 3749;
        System.out.println(intToRoman(num1));  // Output: MMMDCCXLIX

        // Example 2
        int num2 = 58;
        System.out.println(intToRoman(num2));  // Output: LVIII

        // Example 3
        int num3 = 1994;
        System.out.println(intToRoman(num3));  // Output: MCMXCIV
    }

   
    
    public static String intToRoman(int num) {
    	 
    	//LinkedHashMap for - Ensuring the Order of Keys........... 
    	 Map<Integer, String> intToRomanMap = new LinkedHashMap<>();
         
    	 intToRomanMap.put(1000, "M");
         intToRomanMap.put(900, "CM");
         intToRomanMap.put(500, "D");
         intToRomanMap.put(400, "CD");
         intToRomanMap.put(100, "C");
         intToRomanMap.put(90, "XC");
         intToRomanMap.put(50, "L");
         intToRomanMap.put(40, "XL");
         intToRomanMap.put(10, "X");
         intToRomanMap.put(9, "IX");
         intToRomanMap.put(5, "V");
         intToRomanMap.put(4, "IV");
         intToRomanMap.put(1, "I");

         StringBuilder roman = new StringBuilder();

         // Process the integer to construct the Roman numeral
         for (Map.Entry<Integer, String> entry : intToRomanMap.entrySet()) {
             int value = entry.getKey();
             String symbol = entry.getValue();
             // Append the symbol while num is greater than or equal to the current value
             while (num >= value) {
                 roman.append(symbol);
                 num -= value;
             }
         }

         return roman.toString();
     }

}

