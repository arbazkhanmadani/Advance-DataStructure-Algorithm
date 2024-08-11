package in.dsa.string.simple;

public class ReverseWordWithoutUsingSplitMethod {

	public static void main(String[] args){
		String r = reverseString("		I love java programing language.	");
		System.out.println(r);
	}
	
	public static String reverseString(String str){
	
		String tempStr = "";
		String tempStr1 = "";
	
		//Adding extra space for getting last word too. 
		str = str.trim()+" ";
	
		for(int i = 0; i<=str.length()-1; i++){
		
		
			char ch = str.charAt(i);
			if(ch!=' ')
				tempStr +=ch; 
			else{
				if(!tempStr.equals("")){
					for(int j = tempStr.length()-1; j>=0; j--)
						tempStr1 = tempStr1+tempStr.charAt(j);
					
					tempStr1 = tempStr1+" ";
				}
				tempStr = "";
			}
	
		}
	
		return tempStr1;
	}
}
