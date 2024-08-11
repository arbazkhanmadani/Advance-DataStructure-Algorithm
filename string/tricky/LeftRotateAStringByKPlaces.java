package in.dsa.string.tricky;

public class LeftRotateAStringByKPlaces {

	public static void main(String[] args){
		rotateString("Arbaz", 2);
	}
	
	public static void rotateString(String s, int kTimes){
	
		char[] ch = s.toCharArray();
		
		for(int i = 0; i<kTimes; i++){
			
		       char first = ch[0];
		       for(int j = 1; j<ch.length; j++){

				ch[j-1] = ch[j];	
			}
			ch[ch.length-1] = first;
		}	

		for(char elm : ch){
			System.out.print(elm);
		}
	}
}
