package in.dsa.string.simple;

public class LongestCommonPrefix{

	public static void main(String[] args) {

		String s[] = {"welcomeToGoa","welcome", "weldone","well"};
		longestCommonPrefix(s);
	}
	
	
	public static void longestCommonPrefix(String str[]){
		
		String preWord = str[0];
		for(int i = 0; i<str.length; i++){
			
			while(str[i].indexOf(preWord)!=0){
				preWord = preWord.substring(0, preWord.length()-1 );
				//System.out.println(preWord);
				
			}
			if(preWord.isEmpty())return;
	
		}
		
		System.out.println(preWord);
	}
}
