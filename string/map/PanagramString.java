package in.dsa.string.map;
import java.util.TreeSet;
/**
 * 
 * A panagram is a sentance which every char of english alphabet.
 *
 */

public class PanagramString {

	public static void main(String[] args) {


		boolean flag = isPanagram("The quick brown fox jumps over a lazy dog");
		System.out.println(flag);
	
		boolean flag1 = isPanagramInPlace("The quick brown fox jumps over a lazy dog");
		System.out.println(flag1);
	
		boolean flag2 = isPanagramInPlace("The quick brown.");
		System.out.println(flag2);
	
	}
	
	public static boolean isPanagram(String s){
		
		s= s.toLowerCase();
		TreeSet<Character> m = new TreeSet<>();

		for(char ch : s.toCharArray())
			if( ch>='a' && ch<='z' )
			  	m.add(ch);
	
		//26=>bcz English contains 26 letter.......
		return m.size()==26;
	}

	
	public static boolean isPanagramInPlace(String s){
		
		s = s.toLowerCase();
		String panagram ="";
		
		for(char ch : s.toCharArray())
			if(ch>='a' && ch<='z')
				if(panagram.indexOf(ch)==-1)
					panagram+=ch;
		
		int length = panagram.length();
		panagram = null;
		
		return length==26;
	}
}
