package in.dsa.string.simple;

public class ToggleCase {

	public static void main(String[] args) {

		String str = toggleCase("Arbaz _is-A Boy...");
		System.out.println(str);
	}
	
	
	public static String toggleCase(String s){
		
		s = s.trim();
		String str = "", toggleStr = "";
		
		for(int i =0; i<s.length(); i++){
		      
			 str= ""; 
		     char ch = s.charAt(i);
		      
		     if(ch>='A' && ch<='Z'){
		           str= str+ch;
		           str = str.toLowerCase();
		        }
		       else if(ch>='a' && ch<='z'){
		           str= str+ch;
		           str = str.toUpperCase();
		        }
		        else{
		        str= str+ch;
		       }
		toggleStr = toggleStr+str;
		}
		
		return toggleStr;
	}

}
