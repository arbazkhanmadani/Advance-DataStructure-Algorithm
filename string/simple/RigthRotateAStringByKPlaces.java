package in.dsa.string.simple;

public class RigthRotateAStringByKPlaces {

	public static void main(String[] args){
		rotateString("Arbaz", 2);
	}
	
	public static void rotateString(String s, int kTimes){
	
		char[] ch = s.toCharArray();
		
		for(int i = 0; i<kTimes; i++){
			
		       char last = ch[ch.length-1];
		       for(int j =ch.length-2; j>=0; j--){

				ch[j+1] = ch[j];	
			}
			ch[0] = last;
		}	

		for(char elm : ch){
			System.out.print(elm);
		}
	}
}
