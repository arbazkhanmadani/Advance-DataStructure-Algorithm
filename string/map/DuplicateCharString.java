package in.dsa.string.map;
import java.util.*;

public class DuplicateCharString {

	public static void main(String[] args) {
		
		duplicateChars("absjdkedddkjddjvd");
	}
	
	public static void 	duplicateChars(String str){
		
		str = str.replace(" ", "").trim();
		Map<Character, Boolean> m = new HashMap<>();
		
		for(int i = 0; i<str.length(); i++){
			
			char ch = str.charAt(i);
			if(m.get(ch)==null){
				m.put(ch,  false);
			}
			else{
				System.out.println("Duplicate chars are : "+ ch);
				m.put(ch, true);
				//for 1st duplicate character.....
				//break;
			}
			
		}
		
	}
	

}
