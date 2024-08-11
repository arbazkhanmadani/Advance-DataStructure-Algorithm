package in.dsa.string.simple;

public class AllOccuranceOfChar {

	public static void main(String[] args) {

		allOccurance("aababacbc", 'b');
	}
	
	
	public static void allOccurance(String s, char ch){
		
		for(int i =0; i<s.length(); i++){
				if(s.charAt(i)==ch){
					System.out.println(i+" : "+s.charAt(i));
					
			}
		}
	}
}
