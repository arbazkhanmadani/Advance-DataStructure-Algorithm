package in.dsa.string.simple;

public class ReverseStringOrintation {

	public static void main(String[] args){
		String r = reverseString("		I love java programing language.	");
		System.out.println(r);
	}
	
	public static String reverseString(String str){
		
		StringBuffer sb = new StringBuffer();
		String tempStr = "";
		
		//Adding extra space for getting last word too. 
		str = str.trim()+" ";
		for(int i = 0; i<=str.length()-1; i++){
			
			char ch = str.charAt(i);
			if(ch!=' '){
				
				tempStr +=ch; 
			}
			else{
				
				if(!tempStr.equals("")){
					sb.insert(0, tempStr+" ");
				}
				tempStr = "";
			}
		
		}
		
	return sb.toString().trim();
	}
}