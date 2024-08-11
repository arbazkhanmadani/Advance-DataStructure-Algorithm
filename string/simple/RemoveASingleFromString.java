package in.dsa.string.simple;

public class RemoveASingleFromString {

	public static void main(String[] args) {

		String s = remove("programing language.", 'g');
		System.out.println(s);
	}
	
	
	public static String remove(String s, char ch){
		
		s = s.trim();
		String newStr = "";
		
		//s.indexOf(ch)+1 -> +1 so that  we get substr after a G....
		String strAfterG = s.substring(s.indexOf(ch)+1);
		
		for(int i = 0; i<s.indexOf(ch); i++){
				newStr = newStr+s.charAt(i);
		}
		System.out.println(newStr);
	
		return newStr+strAfterG;
	}
}
