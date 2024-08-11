package in.dsa.string.tricky;

import java.util.Collections;
import java.util.List;

public class RemoveASingleFromStringInLast {

	public static void main(String[] args) {

		String s = remove("programing", 'g');
		System.out.println(s);
	}
	
	
	public static String remove(String s, char ch){
		
		s = s.trim();
		//For reverseing.......
		String revS = new StringBuffer(s).reverse().toString();
		
		String newStr = "";
		
		//s.indexOf(ch)+1 -> +1 so that  we get substr after a G....
		String strAfterG = revS.substring(revS.indexOf(ch)+1);
		
		// to romove reversed Str and unreversed it......
		revS = "";
		revS = new StringBuffer(strAfterG).reverse().toString();
		
		for(int i = s.length()-1; i>=0; i--){
			
			if(ch!=s.charAt(i)){
				newStr = newStr+s.charAt(i);
			}
			else break;
				
		}
		
		//new StringBuffer(newStr).reverse() -> to reverse newStr .e -> e.
		return revS+new StringBuffer(newStr).reverse();
	}
}
