package in.dsa.string.tricky;

public class BalancedParanthesisMinumunNumber {

	public static void main(String[] args) {
		
		int balanced = minNumberOfParanthesis("({())}})");
		System.out.println(balanced);
		
		int balanced1 = minNumberOfParanthesis("[{()])})]");
		System.out.println(balanced1);
		
		int balanced2 = minNumberOfParanthesis("())");
		System.out.println(balanced2);
	
	}
	
	public static int minNumberOfParanthesis(String str){
		
		int leftParanthesis=0;
		int rightParanthesis=0;
		
		for(char ch : str.toCharArray()){
			
			if(ch=='(' || ch=='{' || ch=='[')
				leftParanthesis++;
			else{
				if(leftParanthesis!=0)
					leftParanthesis--;
				else
					rightParanthesis++;
			}
		}
		
		return leftParanthesis+rightParanthesis;	
	}

}
