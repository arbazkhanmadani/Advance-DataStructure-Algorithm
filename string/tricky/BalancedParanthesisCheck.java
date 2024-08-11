package in.dsa.string.tricky;

import java.util.Stack;

public class BalancedParanthesisCheck {

	public static void main(String[] args) {
		boolean balanced = balancedParanthesis("(){}[");
		System.out.println(balanced);
	    boolean balanced1 = balancedParanthesis("({[]})");
		System.out.println(balanced1);
	}
	
	public static boolean balancedParanthesis(String str){
		
		Stack<Character> s = new Stack<>();
		
		for(char ch : str.toCharArray()){
			
			if(ch=='(' || ch=='{' || ch=='[' ){
				s.push(ch);
				//System.out.println(stk);
			}
			else{
			    
				if(s.isEmpty() ||				  ( ch==')' && s.pop()!='(' )
				  || ( ch=='}' && s.pop()!='{' )
				  || ( ch==']' && s.pop()!='[' )
				)
	 				//mismatched openin and closing brackets........
			 		return false;
			}
			
		}
		
		//Ensure all brackets are closed............
		return s.isEmpty();
	}
}
