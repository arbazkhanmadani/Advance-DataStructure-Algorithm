package in.dsa.string.simple;

public class NumberOFVowelAndConsonant {

	public static void main(String[] args){
		
		numberOfWovelAndConsonant("this");
	}
	
	
	
	public static void numberOfWovelAndConsonant(String s){
	
		
		s = s.toLowerCase();
		int vow = 0, cons = 0
				;
		for(int i = 0; i<s.length(); i++){
			
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				vow++;
			else if( (ch >'a' && ch<'z') && !(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') )
				cons++;
		}
		
		
			System.out.println("Vowel "+ vow);
			System.out.println("consonant "+ cons);
			
		
	}
}
