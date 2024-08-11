package in.dsa.string.tricky;

public class HappyCharString {

	public static void main(String[] args){
		boolean happy = happyChar("aleza", 'z');
		System.out.println(happy);
	}
	
	
	
	public static boolean happyChar(String s, char c){
	
		char charA[] = s.toLowerCase().toCharArray();
		boolean happy = false;
		
		for(int i = 0; i<charA.length-1; i++)
			if(charA[i]==c)
				//i>0 & i<len-1 -> No element at beg & end....
				if( (i>0 && charA[i-1]==c) || (i<charA.length-1 && charA[i+1]==c) )
					happy = true;
		
			
		return happy;
	}
	
	
}
