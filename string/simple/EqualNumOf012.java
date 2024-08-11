package in.dsa.string.simple;


public class EqualNumOf012 {

	public static void main(String[] args) {

		boolean flag = equalNumOf012("010212");
		System.out.println(flag);
	}
	
	public static boolean equalNumOf012(String s){
		
		int zero = 0, one = 0, two =0;
		
		for(int i=0; i<s.length(); i++){
			
			if(s.charAt(i)=='0')
				zero++;
			else if(s.charAt(i)=='1')
				one++;
			else if(s.charAt(i)=='2')
				two++;
			
		}
		
		
			if(zero==one && one==two && zero==two)
				return true;
			else return false;
	}

}
