package in.dsa.string.simple;

public class RemoveVowelFromgString {

public static void main(String[] args){
		
		removeWovel("this string contains wovel and consonant");
	}
	
	
	
	public static void removeWovel(String s){
	
		s = s.toLowerCase();
		for(int i = 0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				s = s.replace(ch, ' ');
		}
		System.out.println(s);
			
		
	}
}
