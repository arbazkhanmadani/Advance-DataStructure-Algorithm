package in.dsa.string.tricky;

public class RemoveConsecutiveDuplicate {

	public static void main(String[] args){
		remove("aabbccddeefff");
	}
	
	
	public static void remove(String s){
	
		if(s.length()==0) return;
		
		StringBuffer sb = new StringBuffer();
		char pre = s.charAt(0);
		sb.append(pre);
		
		for(int i =0; i<s.length(); i++){
			
			char current = s.charAt(i);
			if(current!=pre){
				sb.append(current);
				pre = current;
			}
		}
		
		System.out.println(sb.toString());
	}

}
