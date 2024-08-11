package in.dsa.string.simple;

public class LastOccuranceOfChar {

	public static void main(String[] args) {

		lastOccurance("aababacbc", 'b');
	}
	
	
	public static void lastOccurance(String s, char ch){
		
		int occure = 0;
		for(int i =0; i<s.length(); i++){
				if(s.charAt(i)==ch){
				occure = i;
			}
		}
		System.out.println(occure);
	}

}
