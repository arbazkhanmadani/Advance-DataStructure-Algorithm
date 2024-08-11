package in.dsa.string.simple;

public class ToggleConsecutiveVowel {

	public static void main(String[] args) {

		String str = toggleCase("My name is arbaz khan");
		System.out.println(str);
	}
	
	
	public static String toggleCase(String s){
		
		//my nAme Is Arbaz khAn
		s = s.toLowerCase();
		String str = "", toggleStr = "";
		int toggle = 0;
		
		for(int i =0; i<s.length(); i++){
		      
			 str= ""; 
			 char ch = s.charAt(i);
		      
		     if(isVowel(ch)){
		    	 
		    	 if(toggle%2==0){
		    		 str=str+ch;
		        	 str = str.toUpperCase();
		        	 toggle=1;
		    	 }
		    	 else{
		    		 str=str+ch;
		        	 str = str.toLowerCase();
		        	 toggle=0;
		    	 }
		     }
		     else
		    	 str= str+ch;
		     
		     toggleStr = toggleStr+str;
		}
		
		return toggleStr;
	}

	
	public static boolean isVowel(char c){
		return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';  
	}
}
