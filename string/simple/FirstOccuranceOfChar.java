package in.dsa.string.simple;

public class FirstOccuranceOfChar {

	public static void main(String[] args) {

		
		firstOccurance("aababacbc", 'b');
	}
	
	public static void firstOccurance(String s, char ch){
		
		int occure = 0;
		for(int i =0; i<s.length(); i++){
			
			if(s.charAt(i)==ch){
				occure = i;
				break;
			}
		}
		System.out.println(occure);
	}

}
