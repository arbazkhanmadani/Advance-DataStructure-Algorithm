package in.dsa.string.simple;

public class StringCompression {

	public static void main(String[] args) {

		String compressed = compression("aabccddddde");
		System.out.println(compressed);
		
	}
	
	
	public static String compression(String s){
		
		//Sentinel....
		s = s+"0";
		
		String cStr = "";
		int count = 1;
		
		for(int i = 0; i<s.length()-1; i++){
			
			if(s.charAt(i)==s.charAt(i+1))
				count++;
			else{
				cStr += s.charAt(i);
				cStr += count;
				count = 1;
			}	
		}
		
		//remove Last Char(Sentinal)...........
		cStr = cStr.substring(0, cStr.length());
		return cStr;
	}

}
