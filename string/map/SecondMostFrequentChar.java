package in.dsa.string.map;

public class SecondMostFrequentChar {

	public static void main(String[] args) {

		char ch = secondFrequentChar("aaabbbbccccd");
		System.out.println(ch);
	}

	
	public static char secondFrequentChar(String s){
		
		char[] carr = new char[256];
		
		//It is imp to remove blank space 
		//otherwise output would be wrong
		s = s.replace(" ", "");
		for(int i = 0; i<s.length(); i++) { 
			(carr[s.charAt(i)])++;
			//System.out.println(	(carr[s.charAt(i)])++);
		}
		int first  = 0;
		int second  = 0;
		for(int i = 0; i<carr.length; i++){
			
			if(carr[i]>carr[first]){
				second = first;
				first= i;
			}
			else if(carr[i] > carr[second] && carr[i]!=carr[first])
				second = i;
		}
		
		return (char)second;
			
	}
}
